package com.sapiensCourses.SpringMVC.Application.controller;

import com.sapiensCourses.SpringMVC.Application.model.CompanyDetails;
import com.sapiensCourses.SpringMVC.Application.model.Contact;
import com.sapiensCourses.SpringMVC.Application.model.Employee;
import com.sapiensCourses.SpringMVC.Application.service.CompanyService;
import com.sapiensCourses.SpringMVC.Application.service.ContactService;
import com.sapiensCourses.SpringMVC.Application.service.EmployeeService;
import com.sapiensCourses.SpringMVC.Application.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class Controller {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private ContactService contactService;

    @GetMapping(value = "/employee", produces = "application/json")
    public List<Employee> getEmployee(){
        List<Employee> employees = employeeService.findsAll();
        return employees;
    }

    @PostMapping(path = "/employeePost",consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee){
        Integer id = employeeService.findsAll().size()+1;
        employee.setId(id);
        employeeService.addEmployee(employee);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(employee.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping(value = "/companyDetails")
    public List<CompanyDetails> getCompany(){
        List<CompanyDetails> comp = companyService.findsAll();
        return comp;
    }

    @GetMapping(value = "/contact")
    public List<Contact> getContact(){
        List<Contact> contacts = contactService.findsAll();
        return contacts;
    }





}
