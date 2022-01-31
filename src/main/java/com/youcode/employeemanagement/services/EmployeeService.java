package com.youcode.employeemanagement.services;

import com.youcode.employeemanagement.dao.DaoFactory;
import com.youcode.employeemanagement.dao.employee.IEmployeeDao;
import com.youcode.employeemanagement.domain.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeService implements IEmployeeService {
    @Override
    public Employee findEmployee(Long id) {
        IEmployeeDao employeeDao = DaoFactory.getInstance().getEmployeeDao();
        System.out.println(employeeDao.findById(id));
        return (Employee) employeeDao.findById(id);
    }

    public List<Employee> getAllEmployees() {
        IEmployeeDao employeeDao = DaoFactory.getInstance().getEmployeeDao();
        System.out.println(employeeDao.findAll());
        return employeeDao.findAll();
    }
}
