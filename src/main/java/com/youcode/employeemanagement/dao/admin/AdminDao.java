package com.youcode.employeemanagement.dao.admin;

import com.youcode.employeemanagement.domain.Admin;
import com.youcode.employeemanagement.dao.DaoFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class AdminDao implements IAdminDao {
    private DaoFactory daoFactory;
    public AdminDao(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }


    @Override
    public List<Admin> findAll() {
        return null;
    }

    @Override
    public Admin findById(Long id) {
        return null;
    }

    @Override
    public Admin create(Admin entity) {
        return null;
    }

    @Override
    public Admin delete(Long id) {
        return null;
    }

    @Override
    public Admin update(Admin entity) {
        return null;
    }

    @Override
    public Object findByEmail(String email) {
        EntityManager em = daoFactory.getEntityManager();
        em.getTransaction().begin();
        TypedQuery<Admin> query = em.createQuery("SELECT a FROM Admin a where a.email=:email", Admin.class);
        query.setParameter("email", email);
        List<Admin> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        if(list.size() <= 0) return null;
        Admin admin = list.get(0);
        em.close();
        return admin;
    }
}