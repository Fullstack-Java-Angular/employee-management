package com.youcode.employeemanagement.config;

import com.youcode.employeemanagement.services.EmployeeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope("prototype")
    public EmployeeService employeeService() {
        return new EmployeeService();
    }
}
