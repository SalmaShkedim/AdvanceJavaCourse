package com.sapiensCourses.FirstSpring.DAO.controller;


import com.sapiensCourses.FirstSpring.DAO.manager.StudentManager;
import com.sapiensCourses.FirstSpring.DAO.model.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {
    @Autowired
    StudentManager manager;

    public StudentDTO createNewStudent() {
        return manager.createNewStudent();
    }
}
