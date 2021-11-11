package com.sapiensCourses.SpringMVC.Application.service;

import com.sapiensCourses.SpringMVC.Application.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    ArrayList<Employee> employees = new ArrayList<Employee>();

    @Override
    public List<Employee> findsAll() {
        employees.add(new Employee(1,"salma",24,"CEO","BA"));
        employees.add(new Employee(2,"akaber",30,"R&D","Bc"));
        employees.add(new Employee(3,"reema",26,"CEO","Bc"));
        employees.add(new Employee(4,"lozan",23,"R&D","BA"));
        employees.add(new Employee(5,"jack",34,"IT","Bc"));
        return employees;
    }

    @Override
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
}
