package com.example.englishcourseproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DisplayExamOfficialController {

    @GetMapping("/exam-officials")
    private String index(Model model){

        return "examOfficial/index";
    }


    @GetMapping("/exam-officials/{id}")
    private String detail(@PathVariable String id, Model model){

        System.out.println("Exam " + id);

        return "examOfficial/detail";
    }
}
