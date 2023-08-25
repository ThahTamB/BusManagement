/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btt.controllers;

import com.btt.pojo.User;
import com.btt.services.UserService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author bthta
 */



@Controller
@ControllerAdvice
public class UsersController {

    @Autowired
    private LocalSessionFactoryBean factory;
    
    @Autowired
    private Environment env;
    @Autowired
    private UserService UserService;
    
//    @GetMapping("/users")
//    public String list(Model model,@RequestParam Map<String, String> params) {
//        model.addAttribute("users", this.UserService.findAllUser());
//        return "users";
//    }
    
    @RequestMapping(value = "users")
    @Transactional
    public String users(Model model,
           @RequestParam Map<String, String> params) {
        //search user
        String kw = params.get("kw");
        if (kw != null && kw.isEmpty()) {
            model.addAttribute("users", this.UserService.findAllUser().stream().filter(l -> l.getUsername().contains(kw)).toArray());
        } else {
             model.addAttribute("users", this.UserService.findAllUser());
        }
       
        return "users";
    }
}
