package com.sapiensCourses.SpringMVC.Application.service;

import com.sapiensCourses.SpringMVC.Application.model.Contact;
import com.sapiensCourses.SpringMVC.Application.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Override
    public List<Contact> findsAll() {
        ArrayList<Contact> contacts = new ArrayList<Contact>();
        contacts.add(new Contact(123456789,"street1","Sapiens@sapiens.com","www.sapiens.com"));
    return contacts;
    }
}
