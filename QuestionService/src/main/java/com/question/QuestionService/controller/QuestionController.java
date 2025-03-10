package com.question.QuestionService.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.QuestionService.entities.Question;
import com.question.QuestionService.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {
    
    private QuestionService questionService;
    public QuestionController(QuestionService questionService){
        this.questionService = questionService;
    }
    @PostMapping
    public Question add(@RequestBody Question question){
        return questionService.add(question);
    }
    @GetMapping
    public List<Question> get(){
        return questionService.get();
    }
    @GetMapping("/{id}")
    public Question get(@PathVariable Long id){
        return questionService.get(id);
    }
    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionByQuizId(@PathVariable Long quizId){
        return questionService.getQuestionByQuizId(quizId);
    }
}
