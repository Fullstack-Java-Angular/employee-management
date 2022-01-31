package com.youcode.employeemanagement.dao.employee;

import com.youcode.employeemanagement.dao.DaoFactory;
import com.youcode.employeemanagement.domain.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeDaoTest {

    @Test
    void delete() {
        IEmployeeDao employeeDao = DaoFactory.getInstance().getEmployeeDao();

        assertInstanceOf(Employee.class,employeeDao.delete(1L));
    }
}