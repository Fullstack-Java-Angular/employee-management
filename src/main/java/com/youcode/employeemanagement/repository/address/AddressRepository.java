package com.youcode.employeemanagement.repository.address;

import com.youcode.employeemanagement.entity.Address;
import com.youcode.employeemanagement.repository.RepositoryFactory;
import com.youcode.employeemanagement.repository.RepositoryUtilities;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.List;

public class AddressRepository implements IAddressRepository {

    @Override
    public List<Address> findAll() {
        Session session = RepositoryFactory.getInstance().buildSession().openSession();
        List<Address> Addresses = RepositoryUtilities.loadAll(Address.class, session);
        session.close();
        return Addresses;
    }

    @Override
    public Address findById(Long id) {
        Session session = RepositoryFactory.getInstance().buildSession().openSession();
        Address address = session.find(Address.class, id);
        session.close();
        return address;
    }

    @Override
    public Long create(Address entity) {
        Session session = RepositoryFactory.getInstance().buildSession().openSession();
        Long id =  (Long) session.save(entity);
        session.close();
        return id;
    }

    @Override
    public int delete(Long id) {
        Session session = RepositoryFactory.getInstance().buildSession().openSession();
        Query query = session.createQuery("DELETE FROM Address WHERE id=:id");
        query.setParameter("id", id);
        int nbOfDeletedRecord = query.executeUpdate();
        session.close();
        return nbOfDeletedRecord;
    }

    @Override
    public int update(Address entity) {
        Session session = RepositoryFactory.getInstance().buildSession().openSession();
        session.update(entity);
        return 0;
    }
}
