package com.youcode.employeemanagement.repository.admin;

import com.youcode.employeemanagement.entity.Admin;
import com.youcode.employeemanagement.repository.RepositoryFactory;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.List;

public class AdminRepository implements IAdminRepository {
    @Override
    public List<Admin> findAll() {
        return null;
    }

    @Override
    public Admin findById(Long id) {
        Session session = RepositoryFactory.getInstance().buildSession().openSession();
        Admin admin = session.find(Admin.class, id);
        session.close();
        return admin;
    }

    @Override
    public Long create(Admin entity) {
        return null;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public int update(Admin entity) {
        return 0;
    }

    @Override
    public Admin findByEmail(String email) {
        Session session = RepositoryFactory.getInstance().buildSession().openSession();
        Query query = session.createQuery("SELECT id, email, password, updatedAt, createdAt FROM Admin where email=:email");
        query.setParameter("email", email);
        List<Admin> list = query.getResultList();
        if(list.size() <= 0) return null;
        Admin admin = list.get(0);
        session.close();
        return admin;
    }
}