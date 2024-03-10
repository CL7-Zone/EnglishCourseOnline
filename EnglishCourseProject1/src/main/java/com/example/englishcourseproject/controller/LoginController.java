package com.example.englishcourseproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {



    @GetMapping("/login")
    private String login(Model model){

        return "login";
    }


    @GetMapping("/register")
    private String register(Model model){

        return "register";
    }
}
