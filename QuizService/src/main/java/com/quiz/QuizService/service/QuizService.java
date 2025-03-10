package com.quiz.QuizService.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.quiz.QuizService.entities.*;
import com.quiz.QuizService.repositories.QuizRepo;

@Service
public class QuizService {

    private QuizRepo quizRepo;
    private QuestionClient questionClient;
    public QuizService(QuizRepo quizRepo, QuestionClient questionClient){
        this.quizRepo = quizRepo;
        this.questionClient = questionClient;
    }

    public Quiz add(Quiz quiz){
        return quizRepo.save(quiz);
    }
    
    public List<Quiz> get(){
        List<Quiz> quizs = quizRepo.findAll();
        List<Quiz> newQuizList = quizs.stream().map(quiz -> {
            quiz.setQuestions(questionClient.getQuestionsOfQuiz(quiz.getId()));
            return quiz;
        }).collect(Collectors.toList());
        return newQuizList;
    }

    public Quiz get(Long id){
        Quiz quiz = quizRepo.findById(id).orElseThrow(()-> new RuntimeException("Quiz not found"));
        quiz.setQuestions(questionClient.getQuestionsOfQuiz(quiz.getId()));
        return quiz;
    }
    
}
