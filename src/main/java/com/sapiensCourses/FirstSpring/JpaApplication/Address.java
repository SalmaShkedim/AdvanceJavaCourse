package com.sapiensCourses.FirstSpring.JpaApplication;

import javax.persistence.*;

@Entity
public class Address {
    @Id
    private int id;
    private String address;
    private int contactNo;
    private String email_id;
    private String country;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", contactNo=" + contactNo +
                ", email_id='" + email_id + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

}