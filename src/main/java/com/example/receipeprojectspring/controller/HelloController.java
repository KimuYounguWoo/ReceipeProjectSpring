package com.example.receipeprojectspring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("test2")
    public String test(Model model)
    {
        model.addAttribute("data",  "TEST!!");
        return "hello";
    }
}


