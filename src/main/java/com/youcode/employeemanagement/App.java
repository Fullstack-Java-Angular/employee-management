package com.youcode.employeemanagement;

import com.youcode.employeemanagement.dao.DaoFactory;
import com.youcode.employeemanagement.dao.admin.IAdminDao;
import com.youcode.employeemanagement.dao.employee.IEmployeeDao;
import com.youcode.employeemanagement.domain.Employee;
import jakarta.persistence.EntityManager;

//package com.youcode.employeemanagement;
//
//import com.youcode.employeemanagement.dao.DaoFactory;
//import com.youcode.employeemanagement.dao.address.IAddressDao;
//import com.youcode.employeemanagement.dao.employee.IEmployeeDao;
//import com.youcode.employeemanagement.domain.Address;
//import com.youcode.employeemanagement.domain.Employee;
//import com.youcode.employeemanagement.services.EmployeeService;
//import org.apache.catalina.LifecycleException;
//import org.apache.catalina.WebResourceRoot;
//import org.apache.catalina.core.StandardContext;
//import org.apache.catalina.startup.Tomcat;
//import org.apache.catalina.webresources.DirResourceSet;
//import org.apache.catalina.webresources.StandardRoot;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import java.io.File;
//import java.time.LocalDate;
//import java.util.Date;
//
public class App {
    public static void main(String[] args) {
//        IEmployeeDao employeeDao = DaoFactory.getInstance().getEmployeeDao();
//        employeeDao.delete(1L);
//        IAdminDao adminDao = DaoFactory.getInstance().getAdminDao();


//        Object abdelhamid = adminDao.findByEmail("abdelhamid@aitayoub.com");
//        System.out.println(abdelhamid);
//        // Get All Employees
//        ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeService.class);
//        EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");
//        System.out.println(employeeService.getAllEmployees());
//
//        // Get One Employee
//        System.out.println(employeeService.findEmployee(2L));
//
//        // Tomcat Configuration
//        String webappDirLocation = "src/main/webapp";
//        Tomcat tomcat = new Tomcat();
//        tomcat.setPort(8080);
//
//        StandardContext ctx = (StandardContext) tomcat.addWebapp("", new File(webappDirLocation).getAbsolutePath());
//
//        File additionWebInfClasses = new File("target/classes");
//        WebResourceRoot resources = new StandardRoot(ctx);
//        resources.addPreResources(new DirResourceSet(resources, "/WEB-INF/classes", additionWebInfClasses.getAbsolutePath(), "/"));
//
//        ctx.setResources(resources);
//
//        tomcat.enableNaming();
//        tomcat.getConnector();
//        try {
//            tomcat.start();
//        } catch (LifecycleException e) {
//            e.printStackTrace();
//        }
//        tomcat.getServer().await();
    }
}
