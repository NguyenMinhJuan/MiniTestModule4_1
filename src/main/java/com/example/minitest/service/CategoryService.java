package com.example.minitest.service;

import com.example.minitest.model.Category;
import com.example.minitest.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    ICategoryRepository categoryRepository;

    @Override
    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> findById(long id) {
        return Optional.empty();
    }

    @Override
    public void save(Category category) {

    }

    @Override
    public void delete(Long id) {

    }
}
