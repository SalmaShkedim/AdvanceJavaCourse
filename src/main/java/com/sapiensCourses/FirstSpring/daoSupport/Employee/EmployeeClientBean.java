package com.sapiensCourses.FirstSpring.daoSupport.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeClientBean {
    @Autowired
    EmployeeService employeeService;

    public void run(){
        System.out.println("Persisting employee");
        Employee employee = Employee.create("jack",24,"CEO & Delivery", 6000.80);
        employeeService.saveEmployee(employee);

        employee = Employee.create("diana",30,"IT", 7500.80);
        employeeService.saveEmployee(employee);

        List<Employee> allEmployees = employeeService.getAllEmployees();
        System.out.println("Employees Loaded: "+allEmployees);

        employee= employeeService.getEmployeeById(71);
        System.out.println("Employee Loaded by id: "+ employee);

        System.out.println("Update the Employees with id 71 ");
        employee.setDesig("R&D");
        employeeService.updateEmployee(employee);

        System.out.println("Deleting the employee");
        employeeService.deleteEmployee(72);

        allEmployees = employeeService.getAllEmployees();
        System.out.println("employees Loaded: "+allEmployees);


    }
}
