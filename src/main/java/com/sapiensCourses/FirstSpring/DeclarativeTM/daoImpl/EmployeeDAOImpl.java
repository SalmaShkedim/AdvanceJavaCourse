package com.sapiensCourses.FirstSpring.DeclarativeTM.daoImpl;

import com.sapiensCourses.FirstSpring.DeclarativeTM.dao.EmployeeDAO;
import com.sapiensCourses.FirstSpring.DeclarativeTM.model.Employee;
import com.sapiensCourses.FirstSpring.DeclarativeTM.model.EmployeeDetails;
import com.sapiensCourses.FirstSpring.DeclarativeTM.model.PersonalInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Employee findEmployee(int empId) {
        final String SELECT_BY_ID_QUERY = "select emp_id, name, age, salary,"+
                "deptname, designation , qualification," +
                "address, contact,email_id "+
                "from employee1 emp, employee1_details det, personal_info info "+
                "where emp.emp_id = det.id_details and det.id_details= info.id_info and emp.emp_id = ?";
        return this.jdbcTemplate.queryForObject(SELECT_BY_ID_QUERY,new EmployeeMapper(), empId);
    }
    private static final class EmployeeMapper implements RowMapper<Employee> {
        @Override
        public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
            Employee emp = new Employee();
            EmployeeDetails details = new EmployeeDetails();
            PersonalInfo info = new PersonalInfo();

            emp.setEmpid(rs.getInt("emp_id"));
            emp.setName(rs.getString("name"));
            emp.setAge(rs.getInt("age"));
            emp.setSalary(rs.getInt("salary"));

            details.setDeptname("deptname");
            details.setDesignation("designation");
            details.setQualification("qualification");

            info.setAddress("address");
            info.setContact("contact");
            info.setEmail_id("email_id");

            emp.setDeptname(details);
            emp.setAddress(info);
            return emp;
        }
    }

    @Override
    public void insertEmployee(Employee emp) {
        final String INSERT_EMP_QUERY = "insert into employee1(emp_id, name, age, salary)values (?,?,?,?)";
        final String INSERT_DETAILS_QUERY = "insert into employee1_details(id_details, deptname, designation,qualification) values (?,?,?,?)";
        final String INSERT_INFO_QUERY = "insert into personal_info(id_info, address, contact,email_id) values (?,?,?,?)";

        jdbcTemplate.update(INSERT_EMP_QUERY, emp.getEmpid(), emp.getName(), emp.getAge(), emp.getSalary());
        System.out.println("Employee inserted Successfully");
        jdbcTemplate.update(INSERT_INFO_QUERY,emp.getEmpid(), emp.getAddress().getAddress(), emp.getAddress().getContact(),emp.getAddress().getEmail_id() );
        System.out.println("Personal Info inserted successfully");
        jdbcTemplate.update(INSERT_DETAILS_QUERY,emp.getEmpid(), emp.getDeptname().getDeptname(), emp.getDeptname().getDesignation(), emp.getDeptname().getQualification());
        System.out.println("Employee Details inserted successfully");
    }
}

