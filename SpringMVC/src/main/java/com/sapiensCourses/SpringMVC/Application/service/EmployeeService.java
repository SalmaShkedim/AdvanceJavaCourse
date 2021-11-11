package com.sapiensCourses.SpringMVC.Application.service;

import com.sapiensCourses.SpringMVC.Application.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findsAll();
    void addEmployee(Employee employee);
}
