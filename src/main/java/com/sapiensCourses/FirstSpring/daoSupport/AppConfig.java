package com.sapiensCourses.FirstSpring.daoSupport;

import com.sapiensCourses.FirstSpring.daoSupport.Employee.EmployeeClientBean;
import com.sapiensCourses.FirstSpring.daoSupport.Person.PersonClientBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
@ComponentScan
public class AppConfig {
    @Bean
    public LocalEntityManagerFactoryBean entityManagerFactoryBean(){
        LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
        factoryBean.setPersistenceUnitName("example-unit");
        return factoryBean;
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.getBean(PersonClientBean.class).run();
        context.getBean(EmployeeClientBean.class).run();

        context.getBean(LocalEntityManagerFactoryBean.class).destroy();


    }

}
