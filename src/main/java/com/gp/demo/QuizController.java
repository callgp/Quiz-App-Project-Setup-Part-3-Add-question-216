package com.gp.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizController {

    @GetMapping("allQuestions")
    public String getAllQuestions(){
         return "hi these are questions";
    }
}
