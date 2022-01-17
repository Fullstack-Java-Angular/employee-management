package com.youcode.employeemanagement.repository;

import com.youcode.employeemanagement.repository.address.AddressRepository;
import com.youcode.employeemanagement.repository.address.IAddressRepository;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RepositoryFactory {
    private Configuration configuration;

    private RepositoryFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    public static RepositoryFactory getInstance() {
        Configuration configuration = new Configuration().configure();
        return new RepositoryFactory(configuration);
    }

    public SessionFactory buildSession() {
        return configuration.buildSessionFactory();
    }

    public IAddressRepository getAddressRepository() {
        return new AddressRepository();
    }
}
