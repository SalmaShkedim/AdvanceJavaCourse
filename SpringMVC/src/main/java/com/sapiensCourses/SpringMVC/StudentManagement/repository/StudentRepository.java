package com.sapiensCourses.SpringMVC.StudentManagement.repository;

import com.sapiensCourses.SpringMVC.StudentManagement.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Students,Long> {
}
