package com.youcode.employeemanagement.dao.admin;

import com.youcode.employeemanagement.domain.Admin;
import com.youcode.employeemanagement.dao.IDao;

public interface IAdminDao extends IDao<Admin> {
    public abstract Object findByEmail(String email);
}
