                            /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btt.controllers;

import com.btt.pojo.User;
import com.btt.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author bthta
 */
@Controller
@ControllerAdvice
public class UserInfController {
    @Autowired
    private UserService  useService;
    
    @GetMapping("/userInf")
    public String list(Model model) {
        model.addAttribute("user", new User());
        return "userInf";
    }
    @PostMapping("/userInf")
    public String add(@ModelAttribute (value = "user")User u){

            if(this.useService.addUser(u)==true)
                return "redirect:/users";
     
            return "userInf";
    }
}