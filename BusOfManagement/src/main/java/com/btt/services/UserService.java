/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.btt.services;

import com.btt.pojo.User;
import java.util.List;

/**
 *
 * @author bthta
 */
public interface UserService {
     List<User> findAllUser();
     boolean addUser(User u);
     boolean checkUsername(User u);
}
