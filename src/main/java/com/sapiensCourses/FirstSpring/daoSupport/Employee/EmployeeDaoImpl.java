package com.sapiensCourses.FirstSpring.daoSupport.Employee;

import com.sapiensCourses.FirstSpring.daoSupport.Dao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;

@Repository
public class EmployeeDaoImpl implements Dao<Employee> {

    @PersistenceUnit
    private EntityManagerFactory emf;

    @Override
    public void save(Employee employee) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(employee);
        em.getTransaction().commit();
        em.close();

    }

    @Override
    public Employee load(long id) {
        EntityManager em = emf.createEntityManager();
        Employee employee = em.find(Employee.class, id);
        em.close();
        return employee;
    }

    @Override
    public void delete(long id) {
        EntityManager em = emf.createEntityManager();
        Employee employee = em.find(Employee.class, id);
        em.getTransaction().begin();
        em.remove(employee);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void update(Employee employee) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(employee);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<Employee> loadAll() {
        EntityManager em = emf.createEntityManager();
        List<Employee> employeeList = em.createQuery("select t from Employee t").getResultList();
        em.close();
        return employeeList;
    }
}
