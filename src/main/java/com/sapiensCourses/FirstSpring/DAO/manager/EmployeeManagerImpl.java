package com.sapiensCourses.FirstSpring.DAO.manager;

import com.sapiensCourses.FirstSpring.DAO.dao.EmployeeDAO;
import com.sapiensCourses.FirstSpring.DAO.model.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeManager")
public class EmployeeManagerImpl implements EmployeeManager {
    @Autowired
    EmployeeDAO dao;

    @Override
    public EmployeeDTO createNewEmployee() {
        return dao.createNewEmployee();
    }
}
