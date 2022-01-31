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

@WebServlet(urlPatterns = "/update")
public class updateEmployeeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String addressLine = req.getParameter("address");
        String phone = req.getParameter("phone");
        Employee employee = new Employee();
        IAddressDao addressDao = DaoFactory.getInstance().getAddressDao();
        Address address = new Address();
        address.setLine(addressLine);
//        addressDao.create(address);

        employee.setId(Long.parseLong(id, 10));
        employee.setName(name);
        employee.setEmail(email);
        employee.setPhone(phone);
        employee.setAddress(address);
        IEmployeeDao employeeDao = DaoFactory.getInstance().getEmployeeDao();
        employeeDao.update(employee);

        resp.sendRedirect("dashboard");
    }
}
