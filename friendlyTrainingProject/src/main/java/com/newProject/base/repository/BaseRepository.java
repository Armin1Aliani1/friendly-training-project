package com.newProject.base.repository;

public interface BaseRepository<T> {
    void save(T t);

    void delete(T t);

    T update(T t);

    void beginTransaction();

    void commitTransaction();

    T findById(int id);
}
