package com.newProject.base.service;

public interface BaseService<T> {
    void save(T t);

    void delete(T t);

    T update(T t);

    void beginTransaction();

    void commitTransaction();
}
