package com.bookdiscovery.demo.service;

import com.bookdiscovery.demo.entity.User;
import com.bookdiscovery.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(int theId) {
        return null;
    }

    @Override
    public void save(User theUser) {

    }

    @Override
    public void deleteById(int theId) {

    }
}
