package com.sapiensCourses.FirstSpring.DAO.manager;

import com.sapiensCourses.FirstSpring.DAO.dao.StudentDAO;
import com.sapiensCourses.FirstSpring.DAO.model.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentManager")
public class StudentManagerImpl implements StudentManager {
    @Autowired
    StudentDAO dao;

    @Override
    public StudentDTO createNewStudent() {
        return dao.createNewStudent();
    }
}
