package com.sapiensCourses.FirstSpring.daoSupport.Employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private int age;
    private String desig;
    private double salary;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", desig='" + desig + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static Employee create(String name,int age,String desig,double salary){
        Employee employee = new Employee();
        employee.setName(name);
        employee.setAge(age);
        employee.setDesig(desig);
        employee.setSalary(salary);
        return employee;
    }


}
