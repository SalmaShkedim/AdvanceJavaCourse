package com.sapiensCourses.FirstSpring.JpaApplication;

import java.util.List;

public interface Dao {
    void insertContact(Contact contact);
    List<Contact> findAll();
    Contact findByContactId(int contact_Id);
    List<Contact> findByCountry(String country);
    List<Contact> findByPremiumAmount(double premium);
    List<Contact> findByInsuranceType(String type);
    void update(Contact contact);
    void delete(int id);
}
