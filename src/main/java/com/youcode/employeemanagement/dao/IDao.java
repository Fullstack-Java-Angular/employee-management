package com.youcode.employeemanagement.dao;

import java.util.List;

public interface IDao<T> {
    public abstract List<T> findAll();
    public abstract T findById(Long id);
    public abstract T create(T entity);
    public abstract T delete(Long id);
    public abstract T update(T entity);
}
