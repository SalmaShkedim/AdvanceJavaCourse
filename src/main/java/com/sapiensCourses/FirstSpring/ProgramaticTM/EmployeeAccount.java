package com.sapiensCourses.FirstSpring.ProgramaticTM;

public class EmployeeAccount {
    int id;
    String name;
    int age;
    String desig;
    int salary;
    int contact;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "EmployeeAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", desig='" + desig + '\'' +
                ", salary=" + salary +
                ", contact=" + contact +
                '}';
    }
}
