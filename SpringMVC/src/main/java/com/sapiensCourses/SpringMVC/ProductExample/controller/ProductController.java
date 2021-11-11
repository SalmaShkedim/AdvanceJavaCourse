package com.sapiensCourses.SpringMVC.ProductExample.controller;

import com.sapiensCourses.SpringMVC.ProductExample.model.Product;
import com.sapiensCourses.SpringMVC.ProductExample.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping(value="/product")
    public List<Product> getProduct(){
        List<Product> products = productService.findsAll();
        return products;
    }

    @GetMapping(value="/companyDetails")
    public List<Product> getProducts(){
        List<Product> products = productService.findsAll();
        return products;
    }

}
