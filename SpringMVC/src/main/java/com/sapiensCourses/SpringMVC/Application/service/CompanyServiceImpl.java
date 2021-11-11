package com.sapiensCourses.SpringMVC.Application.service;

import com.sapiensCourses.SpringMVC.Application.model.CompanyDetails;
import com.sapiensCourses.SpringMVC.Application.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService{
    @Override
    public List<CompanyDetails> findsAll() {
        ArrayList<CompanyDetails> company = new ArrayList<CompanyDetails>();
        company.add(new CompanyDetails("Sapiens", "Insurance Company"));
        return company;
    }

}
