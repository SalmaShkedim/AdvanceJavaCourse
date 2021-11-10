package com.sapiensCourses.FirstSpring.JpaApplication;

import java.util.List;

public interface DaoJpa {
    void saveContact(Contact contact);
    List<Contact> findAll();
    Contact findByContactId(int id);
    List<Contact> findByCountry(String country);
    List<Contact> findByPremiumAmount(double premium_amount);
    List<Contact> findByInsuranceType(String insurance_type);
    void update(Contact contact);
    void delete(int i);
}
