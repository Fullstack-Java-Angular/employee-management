package com.youcode.employeemanagement.repository.employee;

import com.youcode.employeemanagement.entity.Employee;
import com.youcode.employeemanagement.repository.RepositoryFactory;
import com.youcode.employeemanagement.repository.RepositoryUtilities;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    @Override
    public List<Employee> findAll() {
        Session session = RepositoryFactory.getInstance().buildSession().openSession();
        List<Employee> employees = RepositoryUtilities.loadAll(Employee.class, session);
        session.close();
        return employees;
    }

    @Override
    public Employee findById(Long id) {
        Session session = RepositoryFactory.getInstance().buildSession().openSession();
        Employee employee = session.find(Employee.class, id);
        session.close();
        return employee;
    }

    @Override
    public Long create(Employee entity) {
        Session session = RepositoryFactory.getInstance().buildSession().openSession();
        Long id = (Long)session.save(entity);
        session.close();
        return id;
    }

    @Override
    public int delete(Long id) {
        Session session = RepositoryFactory.getInstance().buildSession().openSession();
        Query query = session.createQuery("DELETE FROM Employee WHERE id=:id");
        int nbOfDeletedRecord = query.executeUpdate();
        session.close();
        return nbOfDeletedRecord;
    }

    @Override
    public int update(Employee entity) {
        Session session = RepositoryFactory.getInstance().buildSession().openSession();
        session.update(entity);
        return 0;
    }
}