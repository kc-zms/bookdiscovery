package com.bookdiscovery.demo.service;


import com.bookdiscovery.demo.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    List<Book> findAll();

    Book findById(int theId);

    void save(Book theBook);

    public void deleteById(int theId);

}