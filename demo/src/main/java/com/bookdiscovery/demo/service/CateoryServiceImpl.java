package com.bookdiscovery.demo.service;

import com.bookdiscovery.demo.entity.Category;
import com.bookdiscovery.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CateoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return null;
    }

    @Override
    public Category findById(int theId) {
        return null;
    }

    @Override
    public void save(Category theCategory) {

    }

    @Override
    public void deleteById(int theId) {

    }
}
