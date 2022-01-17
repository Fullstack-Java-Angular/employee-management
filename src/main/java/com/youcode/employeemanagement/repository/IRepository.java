package com.youcode.employeemanagement.repository;

import java.util.List;

public interface IRepository<T> {
    public abstract List<T> findAll();
    public abstract T findById(Long id);
    public abstract Long create(T entity);
    public abstract int delete(Long id);
    public abstract int update(T entity);
}
