package com.youcode.employeemanagement.services;


import com.youcode.employeemanagement.domain.Employee;

public interface IEmployeeService {
    public abstract Employee findEmployee(Long id);
}
