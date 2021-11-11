package com.sapiensCourses.SpringMVC.StudentManagement.controller;

import com.sapiensCourses.SpringMVC.StudentManagement.exception.ResourceNotFoundException;
import com.sapiensCourses.SpringMVC.StudentManagement.model.Students;
import com.sapiensCourses.SpringMVC.StudentManagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(name = "/api/v1")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Students> getAllStudents(){
        return studentRepository.findAll();
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<Students> getEmployeeById(@PathVariable(value = "id") Long studentId) throws ResourceNotFoundException {
        Students student = studentRepository.findById(studentId)
                .orElseThrow(()->new ResourceNotFoundException("Student Not Found ::" + studentId));
        return ResponseEntity.ok().body(student);
    }

    @PostMapping("/students")
    public Students createStudent(@Valid @RequestBody Students students){
        return studentRepository.save(students);
    }

    @PutMapping("/students/{id}")
    public ResponseEntity<Students> updateEmployeeById(@PathVariable(value = "id") Long studentId, @Valid @RequestBody Students studensDetails) throws ResourceNotFoundException{
        Students students = studentRepository.findById(studentId)
                .orElseThrow(()->new ResourceNotFoundException("Student Not Found ::" + studentId));
        students.setFirstName(studensDetails.getFirstName());
        students.setLastName(studensDetails.getLastName());
        students.setGrade(studensDetails.getGrade());
        students.setCity(studensDetails.getCity());
        students.setPercentage(studensDetails.getPercentage());
        students.setGender(studensDetails.getGender());
        students.setAge(studensDetails.getAge());

        final Students updateStudent = studentRepository.save(students);
        return ResponseEntity.ok().body(updateStudent);
    }

    @DeleteMapping("/students/{id}")
    public Map<String, Boolean> deleteStudent(@PathVariable(value = "id") Long studentId) throws  ResourceNotFoundException {
        Students students = studentRepository.findById(studentId).orElseThrow(()-> new ResourceNotFoundException("Student not Found:"+studentId));
        studentRepository.delete(students);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }


}
