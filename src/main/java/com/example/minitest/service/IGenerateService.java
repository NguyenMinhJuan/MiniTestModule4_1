package com.example.minitest.service;

import java.util.Optional;

public interface IGenerateService <T>{
    Iterable<T> findAll();
    Optional<T> findById(long id);
    void save(T t);
    void delete(Long id);
}
