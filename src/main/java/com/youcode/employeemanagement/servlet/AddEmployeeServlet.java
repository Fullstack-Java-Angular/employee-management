package com.youcode.employeemanagement.servlet;

import com.youcode.employeemanagement.dao.DaoFactory;
import com.youcode.employeemanagement.dao.address.IAddressDao;
import com.youcode.employeemanagement.dao.employee.IEmployeeDao;
import com.youcode.employeemanagement.domain.Address;
import com.youcode.employeemanagement.domain.Employee;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/add")
public class AddEmployeeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String addressLine = req.getParameter("address");
        String phone = req.getParameter("phone");

        Address address = new Address();
        address.setLine(addressLine);

//        IAddressDao addressDao = DaoFactory.getInstance().getAddressDao();
//        addressDao.create(address);

        Employee employee = new Employee();
        employee.setName(name);
        employee.setEmail(email);
        employee.setAddress(address);
        employee.setPhone(phone);


        IEmployeeDao employeeDao = DaoFactory.getInstance().getEmployeeDao();
        employeeDao.create(employee);

        resp.sendRedirect("dashboard");


    }
}
