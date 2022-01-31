package com.youcode.employeemanagement.servlet;

import com.youcode.employeemanagement.domain.Employee;
import com.youcode.employeemanagement.services.EmployeeService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.hibernate.service.spi.InjectService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "DashboardServlet", urlPatterns = "/dashboard")

public class DashboardServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Boolean isLogged = (Boolean) session.getAttribute("isLogged");

        if(isLogged != null ) {
            ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeService.class);
            EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");
            List<Employee> employees = employeeService.getAllEmployees();
            req.setAttribute("employees", employees);
            req.getRequestDispatcher("/dashboard.jsp").include(req, resp);
        } else {
            resp.sendRedirect("login");
        }
    }
}
