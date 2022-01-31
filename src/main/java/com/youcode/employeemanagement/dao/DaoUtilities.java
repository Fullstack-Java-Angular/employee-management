package com.youcode.employeemanagement.dao;

import com.youcode.employeemanagement.domain.Employee;
import jakarta.persistence.EntityManager;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import java.util.List;

public class DaoUtilities {
    public static <T> List<T> loadAll(Class<T> type, EntityManager em) {
        Query q = em.createNativeQuery("SELECT * FROM Employee", type);
        List<T> data = q.getResultList();
        return data;
    }
}
