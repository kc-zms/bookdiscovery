package com.bookdiscovery.demo.service;

import com.bookdiscovery.demo.entity.Book;
import com.bookdiscovery.demo.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> findAll();

    User findById(int theId);

    void save(User theUser);

    public void deleteById(int theId);

}
