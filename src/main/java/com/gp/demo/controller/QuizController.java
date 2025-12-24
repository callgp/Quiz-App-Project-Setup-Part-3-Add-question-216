package com.gp.demo.controller;

import com.gp.demo.Question;
import com.gp.demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuizController {

    @Autowired
    QuestionService questionService;
    @GetMapping("allQuestions")
    public List<Question> getAllQuestions(){
         return questionService.getAllQuestions();
    }

//    @GetMapping("allQuestions")
//    public List<Question> getQuestionBYCategory(){
//        return questionService.getAllQuestions();
//    }


}
