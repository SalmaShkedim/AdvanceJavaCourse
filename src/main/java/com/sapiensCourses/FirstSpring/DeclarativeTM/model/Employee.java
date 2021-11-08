package com.sapiensCourses.FirstSpring.DeclarativeTM.model;

public class Employee {
    private int empid;
    private String name;
    private int age;
    private int salary;
    private EmployeeDetails deptname;
    private PersonalInfo address;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public EmployeeDetails getDeptname() {
        return deptname;
    }

    public void setDeptname(EmployeeDetails deptname) {
        this.deptname = deptname;
    }

    public PersonalInfo getAddress() {
        return address;
    }

    public void setAddress(PersonalInfo address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", deptname=" + deptname +
                ", address=" + address +
                '}';
    }
}
