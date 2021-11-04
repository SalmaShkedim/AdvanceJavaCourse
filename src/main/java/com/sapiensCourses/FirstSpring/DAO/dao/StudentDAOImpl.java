package com.sapiensCourses.FirstSpring.DAO.dao;

import com.sapiensCourses.FirstSpring.DAO.model.StudentDTO;
import org.springframework.stereotype.Repository;

@Repository("studentDao")
public class StudentDAOImpl implements StudentDAO {

    @Override
    public StudentDTO createNewStudent() {
        StudentDTO e = new StudentDTO();
        e.setRollNo(101);
        e.setName("lozan");
        e.setGrade("10th");
        e.setPercentage(95.5);
        return e;
    }
}
