/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.btt.repository;

import com.btt.pojo.User;
import java.util.List;

/**
 *
 * @author bthta
 */
public interface UserRepository {
     List<User> findAllUser();
     boolean addUser(User u);
      public boolean checkUsername(User u);
}
