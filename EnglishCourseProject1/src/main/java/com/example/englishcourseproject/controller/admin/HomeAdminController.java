package com.example.englishcourseproject.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeAdminController {


    @GetMapping("/admin/home")
    private String index(Model model){

        return "/admin/home/index";
    }


}
