package com.bookdiscovery.demo.service;

import com.bookdiscovery.demo.entity.Author;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AuthorService {
    List<Author> findAll();

    Author findById(int theId);

    void save(Author theAuthor);

    public void deleteById(int theId);

}
