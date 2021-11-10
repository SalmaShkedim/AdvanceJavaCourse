package com.sapiensCourses.FirstSpring.JpaApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    @Autowired
    private DaoJpa daoJpa;


    public void saveContact(Contact contact){
        try{
            daoJpa.saveContact(contact);
        }catch (DataAccessException e){
            e.printStackTrace();
        }
    }

    public List<Contact> getAllContacts(){
        try{
            return daoJpa.findAll();
        }catch (DataAccessException e){
            e.printStackTrace();
        }
        return null;
    }

    public Contact getByContactId(int id){
        try{
            return daoJpa.findByContactId(id);
        }catch (DataAccessException e){
            e.printStackTrace();
        }
        return null;
    }

    public List<Contact> getByCountry(String country){
        try{
            return daoJpa.findByCountry(country);
        }catch (DataAccessException e){
            e.printStackTrace();
        }
        return null;
    }

    public  List<Contact> getByPremiumAmount(double premium_amount ){
        try{
            return daoJpa.findByPremiumAmount(premium_amount);
        }catch (DataAccessException e){
            e.printStackTrace();
        }
        return null;
    }

    public List<Contact> getByInsuranceType(String insurance_type){
        try{
            return daoJpa.findByInsuranceType(insurance_type);
        }catch (DataAccessException e){
            e.printStackTrace();
        }
        return null;
    }

    public void deleteContact(int i){
        try{
            daoJpa.delete(i);
        }catch (DataAccessException e){
            e.printStackTrace();
        }
    }

    public void updateContact(Contact contact){
        try{
            daoJpa.update(contact);
        }catch (DataAccessException e){
            e.printStackTrace();
        }
    }

}
