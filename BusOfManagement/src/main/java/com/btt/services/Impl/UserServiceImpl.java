/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btt.services.Impl;

import com.btt.pojo.User;
import com.btt.repository.UserRepository;

import com.btt.services.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author bthta
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository repo;
     
    @Override
    public List<User> findAllUser() {
        return this.repo.findAllUser();
    }

    @Override
    public boolean addUser(User u) {
       return  this.repo.addUser(u);
    }

    @Override
    public boolean checkUsername(User u) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
