package com.sapiensCourses.FirstSpring.DeclarativeTM.config;

import com.sapiensCourses.FirstSpring.DeclarativeTM.model.Employee;
import com.sapiensCourses.FirstSpring.DeclarativeTM.model.EmployeeDetails;
import com.sapiensCourses.FirstSpring.DeclarativeTM.model.PersonalInfo;
import com.sapiensCourses.FirstSpring.DeclarativeTM.service.EmployeeService;
import com.sapiensCourses.FirstSpring.DeclarativeTM.serviceImpl.EmployeeServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        EmployeeService employeeService = context.getBean("employeeServiceImpl", EmployeeServiceImpl.class);
        employeeService.addEmployee(createEmployee());
        employeeService.getEmployee(1);
        context.registerShutdownHook();
    }
    private static Employee createEmployee() {
        Employee employee = new Employee();
        EmployeeDetails employeeDetails = new EmployeeDetails();
        PersonalInfo personalInfo = new PersonalInfo();
        employee.setEmpid(1);
        employee.setName("Salma");
        employee.setAge(24);
        employee.setSalary(6000);
        employeeDetails.setId_details(employee.getEmpid());
        employeeDetails.setDeptname("CEO Delivery");
        employeeDetails.setDesignation("Developer");
        employeeDetails.setQualification("BA");
        personalInfo.setId_info(employee.getEmpid());
        personalInfo.setAddress("Street1");
        personalInfo.setContact("123456789");
        personalInfo.setEmail_id("salma123@gmail.com");
        employee.setDeptname(employeeDetails);
        employee.setAddress(personalInfo);
        return employee;
    }
}
