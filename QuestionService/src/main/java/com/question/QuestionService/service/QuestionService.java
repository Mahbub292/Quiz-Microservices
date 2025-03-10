package com.question.QuestionService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.question.QuestionService.entities.Question;
import com.question.QuestionService.repository.QuestionRepo;

@Service
public class QuestionService {
    private QuestionRepo questionRepo;
    public QuestionService(QuestionRepo questionRepo){
        this.questionRepo = questionRepo;
    }

    public Question add(Question question){
        return questionRepo.save(question);
    }
    public List<Question> get(){
        return questionRepo.findAll();
    }
    public Question get(Long id){
        return questionRepo.findById(id).orElseThrow(()-> new RuntimeException("Question not found"));
    }
    public List<Question> getQuestionByQuizId(Long quizId){
        return questionRepo.findByQuizId(quizId);
    }
}
