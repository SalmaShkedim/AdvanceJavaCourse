package com.sapiensCourses.FirstSpring.DAO.model;

public class StudentDTO {
    private Integer rollNo;
    private String name;
    private String grade;
    private Double percentage;

    public Integer getRollNo(int i) {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Double  getPercentage() {
        return percentage;
    }

    public void setPercentage(Double  percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", percentage=" + percentage +
                '}';
    }
}
