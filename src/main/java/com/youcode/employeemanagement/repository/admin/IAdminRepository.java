package com.youcode.employeemanagement.repository.admin;

import com.youcode.employeemanagement.entity.Admin;
import com.youcode.employeemanagement.repository.IRepository;

public interface IAdminRepository extends IRepository<Admin> {
    public abstract Admin findByEmail(String email);
}
