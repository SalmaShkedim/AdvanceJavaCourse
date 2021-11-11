package com.sapiensCourses.SpringMVC.EmployeeExample;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {
    private static EmployeeDetails list = new EmployeeDetails();

    static {
        list.getEmployeeList().add(new Employee(1,"Scooby", "scooby@gmail.com"));
        list.getEmployeeList().add(new Employee(2,"Shaggy", "shaggy@gmail.com"));
        list.getEmployeeList().add(new Employee(3,"Scrappy", "scrappy@gmail.com"));
        list.getEmployeeList().add(new Employee(4,"Olive", "olive@gmail.com"));
    }

    public EmployeeDetails getAllEmployees(){
        return list;
    }

    public void addEmployee(Employee employee){
        list.getEmployeeList().add(employee);
    }
}
