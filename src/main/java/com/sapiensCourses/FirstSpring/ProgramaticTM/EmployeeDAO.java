package com.sapiensCourses.FirstSpring.ProgramaticTM;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    private JdbcTemplate jdbcTemplate;
    private TransactionTemplate transactionTemplate;

    // setter and getter for TransactionTemplate


    public TransactionTemplate getTransactionTemplate() {
        return transactionTemplate;
    }

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }


    //setter and getter for Jdbc Template
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    //create a table
    public void createTable() {
        String query = "CREATE TABLE Employee_ACCOUNT(Id INT, Name VARCHAR(20), Age INT, Desig VARCHAR(30), Salary INT ,Contact INT)";
        jdbcTemplate.execute(query);
    }

    //adding employee
    public void addEmployee(int id, String name, int age , String desig, int salary,int contact ) {
        String query = "INSERT INTO Employee_ACCOUNT VALUES("+id+",'"+name+"',"+age+",'"+desig+"',"+salary+","+contact+")";
        jdbcTemplate.execute(query);
    }

    //update employee data
    public void updateEmployee(int id, String column, int value){
      transactionTemplate.execute(new TransactionCallback<Object>() {
          @Override
          public Object doInTransaction(TransactionStatus status) {
              try{getJdbcTemplate().update("update Employee_ACCOUNT set "+column+" =  ? where id =?", value, id);
              } catch (Exception e){
                  status.isRollbackOnly();
              }
              return null;
          }
      });
    }

    //delete employee
    public void deleteEmployee(int id) {
        String query = "DELETE FROM Employee_ACCOUNT WHERE ID =" + id;
        jdbcTemplate.execute(query);
    }

    //count of data
    public int countEmployee() {
        String query = "select count(*) from Employee_ACCOUNT";
        return jdbcTemplate.queryForObject(query, Integer.class);
    }

    // extracting the  data
    public List<EmployeeAccount> getAllEmployee() {
        String query = "select * from Employee_ACCOUNT";
        return jdbcTemplate.query(query, new ResultSetExtractor<List<EmployeeAccount>>() {
            @Override
            public List<EmployeeAccount> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<EmployeeAccount> customerAccounts = new ArrayList<EmployeeAccount>();
                while (rs.next()) {
                    EmployeeAccount customerAccount = new EmployeeAccount();
                    customerAccount.setId(rs.getInt("id"));
                    customerAccount.setName(rs.getString("name"));
                    customerAccount.setAge(rs.getInt("age"));
                    customerAccount.setDesig(rs.getString("desig"));
                    customerAccount.setSalary(rs.getInt("salary"));
                    customerAccount.setContact(rs.getInt("contact"));
                    customerAccounts.add(customerAccount);
                }
                return customerAccounts;
            }
        });
    }
}