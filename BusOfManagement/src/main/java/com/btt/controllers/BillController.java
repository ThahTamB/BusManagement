/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btt.controllers;

import com.btt.pojo.Bill;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author bthta
 */
@Controller
@ControllerAdvice
public class BillController {

    @GetMapping("/bill")
    public String list(Model model) {
        model.addAttribute("bill", new Bill());
        return "bill";
    }
}
