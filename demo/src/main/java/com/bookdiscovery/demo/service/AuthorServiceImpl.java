package com.bookdiscovery.demo.service;

import com.bookdiscovery.demo.entity.Author;
import com.bookdiscovery.demo.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AuthorServiceImpl implements AuthorService{

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<Author> findAll() {
        return null;
    }

    @Override
    public Author findById(int theId) {
        return null;
    }

    @Override
    public void save(Author theAuthor) {

    }

    @Override
    public void deleteById(int theId) {

    }
}
