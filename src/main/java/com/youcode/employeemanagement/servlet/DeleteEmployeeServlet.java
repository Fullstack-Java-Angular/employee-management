package com.youcode.employeemanagement.servlet;

import com.youcode.employeemanagement.dao.DaoFactory;
import com.youcode.employeemanagement.dao.employee.IEmployeeDao;
import com.youcode.employeemanagement.domain.Employee;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/delete")
public class DeleteEmployeeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // delete its not working...
        String id = req.getParameter("id");
        System.out.println(id);
        IEmployeeDao employeeDao = DaoFactory.getInstance().getEmployeeDao();
        Employee deletedEmployee = employeeDao.delete(Long.parseLong(id));
        System.out.println(id);
        System.out.println(deletedEmployee);
        resp.sendRedirect("dashboard");
    }
}
