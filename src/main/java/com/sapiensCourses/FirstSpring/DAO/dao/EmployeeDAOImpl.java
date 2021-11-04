package com.sapiensCourses.FirstSpring.DAO.dao;

import com.sapiensCourses.FirstSpring.DAO.model.EmployeeDTO;
import org.springframework.stereotype.Repository;

@Repository("employeeDao")
public class EmployeeDAOImpl implements EmployeeDAO {
    @Override
    public EmployeeDTO createNewEmployee() {
        EmployeeDTO e = new EmployeeDTO();
        e.setId(101);
        e.setName("salma");
        e.setAge(24);
        e.setGender("Female");
        e.setDesignation("CEO & Delivery");
        e.setQualification("BA");
        return e;
    }
}
