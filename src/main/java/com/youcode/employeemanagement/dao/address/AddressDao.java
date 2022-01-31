package com.youcode.employeemanagement.dao.address;

import com.youcode.employeemanagement.dao.DaoFactory;
import com.youcode.employeemanagement.domain.Address;
import com.youcode.employeemanagement.dao.DaoUtilities;
import jakarta.persistence.*;

import java.util.List;

public class AddressDao implements IAddressDao {
    private DaoFactory daoFactory;
    public AddressDao(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public List<Address> findAll() {
        EntityManager em = daoFactory.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        List<Address> addresses = DaoUtilities.loadAll(Address.class, em);
        tx.commit();
        em.close();
        return addresses;
    }

    @Override
    public Address findById(Long id) {
        EntityManager em = daoFactory.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Address address = em.find(Address.class, id);
        tx.commit();
        em.close();
        return address;
    }

    @Override
    public Address create(Address entity) {
        EntityManager em = daoFactory.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(entity);
        tx.commit();
        em.close();
        return entity;
    }

    @Override
    public Address delete(Long id) {
        EntityManager em = daoFactory.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Address address = em.getReference(Address.class, id);
        em.remove(address);
        tx.commit();
        em.close();
        return address;
    }

    @Override
    public Address update(Address entity) {
        EntityManager em = daoFactory.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Address address = em.merge(entity);
        tx.commit();
        em.close();
        return address;
    }
}
