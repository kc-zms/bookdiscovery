package com.bookdiscovery.demo.service;

import com.bookdiscovery.demo.entity.Book;
import com.bookdiscovery.demo.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    List<Category> findAll();

    Category findById(int theId);

    void save(Category theCategory);

    public void deleteById(int theId);

}
