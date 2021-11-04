package com.sapiensCourses.FirstSpring.DAO.controller;

import com.sapiensCourses.FirstSpring.DAO.manager.EmployeeManager;
import com.sapiensCourses.FirstSpring.DAO.model.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeManager manager;

    public EmployeeDTO createNewEmployee() {
        return manager.createNewEmployee();

    }
}
