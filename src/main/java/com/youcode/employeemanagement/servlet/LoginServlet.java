package com.youcode.employeemanagement.servlet;

import java.io.*;

import com.youcode.employeemanagement.dao.DaoFactory;
import com.youcode.employeemanagement.dao.admin.IAdminDao;
import com.youcode.employeemanagement.domain.Admin;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


public class LoginServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/login.jsp").include(request, response);
//        HttpSession session = request.getSession();
//        Boolean isLogged = (Boolean) session.getAttribute("isLogged");
//        if(isLogged || isLogged != null) {
//            response.sendRedirect("dashboard");
//        }

//        response.setContentType("text/html");
//
//        // Hello
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>Hello world</h1>");
//        out.println("<h1>" + getServletConfig().getInitParameter("title") + "</h1>");
//        out.println("<h1>" + getInitParameter("title") + "</h1>");
//        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        IAdminDao adminDao = DaoFactory.getInstance().getAdminDao();
        Admin admin = (Admin)adminDao.findByEmail("abdelhamid@aitayoub.com");
        if(admin!=null && admin.getEmail().equalsIgnoreCase(email) && admin.getPassword().equalsIgnoreCase(password)) {
            HttpSession session = request.getSession();
            session.setAttribute("isLogged", true);
            session.setAttribute("admin", 1);
            response.sendRedirect("dashboard");
        } else {
            response.sendRedirect("login");
        }
    }
}