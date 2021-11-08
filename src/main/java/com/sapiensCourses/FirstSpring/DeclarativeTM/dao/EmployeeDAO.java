package com.sapiensCourses.FirstSpring.DeclarativeTM.dao;

import com.sapiensCourses.FirstSpring.DeclarativeTM.model.Employee;

public interface EmployeeDAO {
    public Employee findEmployee(int empId);
    public void insertEmployee(Employee emp);
}
