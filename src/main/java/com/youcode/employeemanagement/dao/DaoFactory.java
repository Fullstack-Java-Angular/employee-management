package com.youcode.employeemanagement.dao;

import com.youcode.employeemanagement.dao.address.AddressDao;
import com.youcode.employeemanagement.dao.address.IAddressDao;
import com.youcode.employeemanagement.dao.admin.AdminDao;
import com.youcode.employeemanagement.dao.admin.IAdminDao;
import com.youcode.employeemanagement.dao.employee.EmployeeDao;
import com.youcode.employeemanagement.dao.employee.IEmployeeDao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DaoFactory {
    private EntityManagerFactory emf;
    private DaoFactory() {
        this.emf = Persistence.createEntityManagerFactory("hibernate-persistence-unit");
    }

    public static DaoFactory getInstance() {
        return new DaoFactory();
    }

    public EntityManager getEntityManager() {
        return this.emf.createEntityManager();
    }

    public IAddressDao getAddressDao() {
        return new AddressDao(this);
    }
    public IEmployeeDao getEmployeeDao() {
        return new EmployeeDao(this);
    }
    public IAdminDao getAdminDao() {
        return new AdminDao(this);
    }
}
