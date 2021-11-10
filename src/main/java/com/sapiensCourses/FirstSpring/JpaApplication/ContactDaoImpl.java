package com.sapiensCourses.FirstSpring.JpaApplication;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;

@Repository
public class ContactDaoImpl implements DaoJpa {
    @PersistenceUnit
    private EntityManagerFactory emf;

    @Override
    public void saveContact(Contact contact) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(contact);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<Contact> findAll() {
        EntityManager em = emf.createEntityManager();
        List<Contact> contactList = em.createQuery("select t from Contact t").getResultList();
        em.close();
        return contactList;
    }

    @Override
    public Contact findByContactId(int id) {
        EntityManager em = emf.createEntityManager();
        Contact contact = em.find(Contact.class, id);
        em.close();
        return contact;
    }

    @Override
    public List<Contact> findByCountry(String country) {
        EntityManager em = emf.createEntityManager();
        List<Contact> contactList = em.createQuery("select t from Contact t where t.address.country = :column1").setParameter("column1",country).getResultList();
        em.close();
        return contactList;
    }

    @Override
    public List<Contact> findByPremiumAmount(double premium_amount) {
        EntityManager em = emf.createEntityManager();
        List<Contact> contactList = em.createQuery("select t from Contact t where t.insurancedetails.premium_amount = :column1").setParameter("column1",premium_amount).getResultList();
        em.close();
        return contactList;
    }

    @Override
    public List<Contact> findByInsuranceType(String insurance_type) {
        EntityManager em = emf.createEntityManager();
        List<Contact> contactList = em.createQuery("select t from Contact t where t.insurancedetails.insurance_type = :column1").setParameter("column1",insurance_type).getResultList();
        em.close();
        return contactList;
    }

    @Override
    public void update(Contact contact) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(contact);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void delete(int i) {
        EntityManager em = emf.createEntityManager();
        Contact contact = em.find(Contact.class, i);
        em.getTransaction().begin();
        em.remove(contact);
        em.getTransaction().commit();
        em.close();
    }
}
