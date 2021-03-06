package com.sapiensCourses.FirstSpring.JpaApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ContactClientBean {
    @Autowired
    ContactService contactService;

    public void run(){
        System.out.println("Persisting Contact");

        Address address = new Address();
        address.setAddress("ABC Street");
        address.setContactNo("123456789");
        address.setEmailID("salma123@gmail.com");
        address.setCountry("Israel");

        Insurance insurance= new Insurance();
        insurance.setType("Life");
        insurance.setValidTill("2030");
        insurance.setPremium(100.25);


        Contact contact = Contact.create(1,"salma","shk","23/05/1996","CEO",address,insurance);
        contactService.insertContact(contact);


        List<Contact> allContacts = contactService.getAllContacts();
        System.out.println("Contact Loaded: "+allContacts);

        contact= contactService.getContactById(71);
        System.out.println("Contact Loaded by id: "+ contact);

        allContacts = contactService.getByCountry("Israel");
        System.out.println("Contacts Loaded by country : " +allContacts);

        allContacts = contactService.getByPremium(100.25);
        System.out.println("Contacts Loaded by premium : " +allContacts);

        allContacts = contactService.getByInsuranceType("Life");
        System.out.println("Contacts Loaded by Insurance Type : " +allContacts);

        System.out.println("Update the Contacts with id 67 ");
        contact.setDesign("R&D");
        contactService.updateContact(contact);

        System.out.println("Deleting the employee");
        contactService.deleteContact(67);

        allContacts = contactService.getAllContacts();
        System.out.println("employees Loaded: "+allContacts);


    }

}
