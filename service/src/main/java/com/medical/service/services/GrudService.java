package com.medical.service.services;

import java.util.Set;

public interface GrudService<T, id>  {

    Set<T> findAll();

    T findById(id id);

    T save(T object);

    void delete(T object);

    void deleteById(id id);
}
