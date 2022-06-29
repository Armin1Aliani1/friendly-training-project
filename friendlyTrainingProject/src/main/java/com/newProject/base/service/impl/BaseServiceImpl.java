package com.newProject.base.service.impl;

import com.newProject.base.BaseEntity;
import com.newProject.base.repository.impl.BaseRepositoryImpl;
import com.newProject.base.service.BaseService;

public class BaseServiceImpl<T extends BaseEntity, R extends BaseRepositoryImpl<T>> implements BaseService<T> {

    R repository;

    @Override
    public void save(T t) {
        beginTransaction();
        repository.save(t);
        commitTransaction();
    }

    @Override
    public void delete(T t) {
        beginTransaction();
        repository.delete(t);
        commitTransaction();
    }

    @Override
    public T update(T t) {
        beginTransaction();
        T tOne = repository.update(t);
        commitTransaction();
        return tOne;
    }

    @Override
    public void beginTransaction() {
        repository.beginTransaction();
    }

    @Override
    public void commitTransaction() {
        repository.commitTransaction();
    }
}
