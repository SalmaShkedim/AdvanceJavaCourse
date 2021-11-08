package com.sapiensCourses.FirstSpring.ProgramaticTM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;

public class Utility {
    public static void main(String[] args) {
        //exercise 1
        ApplicationContext context = new FileSystemXmlApplicationContext("C:\\AdvanceJavaCourseDay2\\AdvanceJavaDay2\\src\\main\\resources\\Beans.xml");
        EmployeeDAO employeeDAO = context.getBean("EmployeeDAOBean", EmployeeDAO.class );
        System.out.println("Create a table");

        //exercise 2
        employeeDAO.createTable();
        System.out.println("Adding Data to Table");
        employeeDAO.addEmployee(1, "Salma",24,"CEO & Delivery",6000,123456789);
        employeeDAO.addEmployee(2, "Lozan", 23,"IT", 5000,987654321 );
        employeeDAO.addEmployee(3, "Reema", 26, "CEO & Delivery", 5500,123654789);
        employeeDAO.addEmployee(4, "Akaber", 30,"R&D",6500,987456321);
        employeeDAO.addEmployee(5, "Mark", 34,"IT", 7000,654789123 );
        employeeDAO.addEmployee(6, "Jack", 22, "CEO & Delivery", 4000,321987456);
        employeeDAO.addEmployee(7, "Jacob", 35,"R&D",6800,987987123);

        System.out.println("Extracting the data ");
        List<EmployeeAccount> allEmployees = employeeDAO.getAllEmployee();
        for(EmployeeAccount employeeAccount: allEmployees){
            System.out.println("Employee Id: " + employeeAccount.getId());
            System.out.println("Employee Name: "+ employeeAccount.getName());
            System.out.println("Employee's Age: "+ employeeAccount.getAge());
            System.out.println("Employee Desig: " + employeeAccount.getDesig());
            System.out.println("Employee Salary: "+ employeeAccount.getSalary());
            System.out.println("Employee's Contact: "+ employeeAccount.getContact());

        }
        //exercise 3
        System.out.println("Update Salary for employee 3");
        employeeDAO.updateEmployee(3,"Salary", 20000);
        System.out.println("Update Salary for employee 6");
        employeeDAO.updateEmployee(6,"Salary", 7000);


        System.out.println("Extracting the data ");
        List<EmployeeAccount> allEmployees1 = employeeDAO.getAllEmployee();
        for(EmployeeAccount employeeAccount: allEmployees1){
            System.out.println("Employee Id: " + employeeAccount.getId());
            System.out.println("Employee Name: "+ employeeAccount.getName());
            System.out.println("Employee's Age: "+ employeeAccount.getAge());
            System.out.println("Employee Desig: " + employeeAccount.getDesig());
            System.out.println("Employee Salary: "+ employeeAccount.getSalary());
            System.out.println("Employee's Contact: "+ employeeAccount.getContact());

        }

        //exercise4
        System.out.println("Update Contact for employee 4");
        employeeDAO.updateEmployee(4,"Contact", 123789987);
        System.out.println("Update Contact for employee 7");
        employeeDAO.updateEmployee(7,"Contact", 456321123);

        System.out.println("Extracting the data ");
        List<EmployeeAccount> allEmployees2 = employeeDAO.getAllEmployee();
        for(EmployeeAccount employeeAccount: allEmployees2){
            System.out.println("Employee Id: " + employeeAccount.getId());
            System.out.println("Employee Name: "+ employeeAccount.getName());
            System.out.println("Employee's Age: "+ employeeAccount.getAge());
            System.out.println("Employee Desig: " + employeeAccount.getDesig());
            System.out.println("Employee Salary: "+ employeeAccount.getSalary());
            System.out.println("Employee's Contact: "+ employeeAccount.getContact());

        }

        //exercise5
        System.out.println("Update Age for employee 2");
        employeeDAO.updateEmployee(2,"Age", 24);
        System.out.println("Update Age for employee 5");
        employeeDAO.updateEmployee(5,"Age", 35);

        System.out.println("Extracting the data ");
        List<EmployeeAccount> allEmployees3 = employeeDAO.getAllEmployee();
        for(EmployeeAccount employeeAccount: allEmployees3){
            System.out.println("Employee Id: " + employeeAccount.getId());
            System.out.println("Employee Name: "+ employeeAccount.getName());
            System.out.println("Employee's Age: "+ employeeAccount.getAge());
            System.out.println("Employee Desig: " + employeeAccount.getDesig());
            System.out.println("Employee Salary: "+ employeeAccount.getSalary());
            System.out.println("Employee's Contact: "+ employeeAccount.getContact());

        }

        //exercise6
        System.out.println("Count of Customers: "+ employeeDAO.countEmployee());
        System.out.println("Deleting a customer");employeeDAO.deleteEmployee(1);
        System.out.println("Count of Customers: "+ employeeDAO.countEmployee());

        System.out.println("Extracting the data ");
        List<EmployeeAccount> allEmployees4 = employeeDAO.getAllEmployee();
        for(EmployeeAccount employeeAccount: allEmployees4){
            System.out.println("Employee Id: " + employeeAccount.getId());
            System.out.println("Employee Name: "+ employeeAccount.getName());
            System.out.println("Employee's Age: "+ employeeAccount.getAge());
            System.out.println("Employee Desig: " + employeeAccount.getDesig());
            System.out.println("Employee Salary: "+ employeeAccount.getSalary());
            System.out.println("Employee's Contact: "+ employeeAccount.getContact());
        }
    }
}


