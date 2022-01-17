package com.youcode.employeemanagement;

import com.youcode.employeemanagement.entity.Address;
import com.youcode.employeemanagement.repository.RepositoryFactory;
import com.youcode.employeemanagement.repository.RepositoryUtilities;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class App {
    public static void main(String[] args) {
        // Build Hibernate Session
        RepositoryFactory.getInstance().buildSession();

        Address a = new Address();
        a.setCountry("ksdk");
        a.setPays("kdksd");
        System.out.println(RepositoryFactory.getInstance().getAddressRepository().create(a));

        // Tomcat Configuration
        String webappDirLocation = "src/main/webapp";
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        StandardContext ctx = (StandardContext) tomcat.addWebapp("", new File(webappDirLocation).getAbsolutePath());

        File additionWebInfClasses = new File("target/classes");
        WebResourceRoot resources = new StandardRoot(ctx);
        resources.addPreResources(new DirResourceSet(resources, "/WEB-INF/classes", additionWebInfClasses.getAbsolutePath(), "/"));

        ctx.setResources(resources);

        tomcat.enableNaming();
        tomcat.getConnector();
        try {
            tomcat.start();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
        tomcat.getServer().await();
    }
}
