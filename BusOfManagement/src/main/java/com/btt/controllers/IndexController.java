package com.btt.controllers;

import com.btt.pojo.User;
import com.btt.services.BusService;
import com.btt.services.LocationService;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author bthta
 */
@Controller
public class IndexController {

    @Autowired
    private LocalSessionFactoryBean factory;
    @Autowired
    private Environment env;
    @Autowired
    private LocationService LocationService;
    

    
    //Hàm chạy các respond luôn luôn xuất hiện tại các trang
    @ModelAttribute
    public void commonAttr(Model model){
    
    }
    
    @RequestMapping(value = "/")
    @Transactional
    public String index(Model model,
            @RequestParam Map<String, String> params) {
        //search province
        String kw = params.get("kw");
        if (kw != null && kw.isEmpty()) {
            model.addAttribute("provinces", this.LocationService.findAllProvinces().stream().filter(l -> l.getName().contains(kw)).toArray());
        } else {
            model.addAttribute("provinces", this.LocationService.findAllProvinces());
        }

        //get user
        List<User> users = List.of(new User(1, "thanhtam", "admin123", "admin"),
                new User(2, "binhphong", "admin123", "admin"));
        model.addAttribute("users", users);

        return "index";
    }
    
   
}
