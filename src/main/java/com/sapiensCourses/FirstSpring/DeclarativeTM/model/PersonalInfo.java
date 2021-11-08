package com.sapiensCourses.FirstSpring.DeclarativeTM.model;

public class PersonalInfo {
    int id_info;
    String address;
    String contact;
    String email_id;

    public int getId_info() {
        return id_info;
    }

    public void setId_info(int id_info) {
        this.id_info = id_info;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    @Override
    public String toString() {
        return "PersonalInfo{" +
                "id_info=" + id_info +
                ", address='" + address + '\'' +
                ", contact=" + contact +
                ", email_id='" + email_id + '\'' +
                '}';
    }
}
