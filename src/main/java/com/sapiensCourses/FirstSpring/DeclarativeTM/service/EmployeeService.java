package com.sapiensCourses.FirstSpring.DeclarativeTM.service;

import com.sapiensCourses.FirstSpring.DeclarativeTM.model.Employee;

public interface EmployeeService {
    public Employee getEmployee(int empId);
    public void addEmployee(Employee emp);
}
