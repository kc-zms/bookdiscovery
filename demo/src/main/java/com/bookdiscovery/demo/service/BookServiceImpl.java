package com.bookdiscovery.demo.service;

import com.bookdiscovery.demo.entity.Book;
import com.bookdiscovery.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public Book findById(int theId) {
        return null;
    }

    @Override
    public void save(Book theBook) {

    }

    @Override
    public void deleteById(int theId) {

    }
}
