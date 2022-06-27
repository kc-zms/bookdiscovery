package com.bookdiscovery.demo.service;

import com.bookdiscovery.demo.entity.Book;
import com.bookdiscovery.demo.entity.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleService {
    List<Role> findAll();

    Role findById(int theId);

    void save(Role theRole);

    public void deleteById(int theId);

}
