package com.example.englishcourseproject.controller;

import com.example.englishcourseproject.model.test.TestExam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DisplayHomeController {


    @GetMapping("/home")
    private String index(Model model){


        return "home/index";
    }
}
