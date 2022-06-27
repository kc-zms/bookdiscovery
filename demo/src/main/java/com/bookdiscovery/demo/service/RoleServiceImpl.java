package com.bookdiscovery.demo.service;

import com.bookdiscovery.demo.entity.Role;
import com.bookdiscovery.demo.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> findAll() {
        return null;
    }

    @Override
    public Role findById(int theId) {
        return null;
    }

    @Override
    public void save(Role theRole) {

    }

    @Override
    public void deleteById(int theId) {

    }
}
