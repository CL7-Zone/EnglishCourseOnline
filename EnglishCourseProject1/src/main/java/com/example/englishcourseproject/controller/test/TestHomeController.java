package com.example.englishcourseproject.controller.test;

import com.example.englishcourseproject.model.test.TestExam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestHomeController {

    @GetMapping("/")
    private String index(Model model){

        List<TestExam> testExams = new ArrayList<>();

        for (int i=0; i<6; i++){
            testExams.add(new TestExam(
                            " IELTS Simulation Listening test 4\n",
                            "toeic2.jpg"
                            ,3000,
                            60,
                            4,
                            "Listening"
                    )
            );
        }

        model.addAttribute("testExams", testExams);

        return "home/index";
    }
}
