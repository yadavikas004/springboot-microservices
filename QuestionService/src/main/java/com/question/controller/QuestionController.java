package com.question.controller;

import com.question.entities.Question;
import com.question.services.QuestionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/question")
@AllArgsConstructor
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping
    public Question create(@RequestBody Question question){
        return questionService.create(question);
    }

    @GetMapping
    public List<Question> getAll(){
        return questionService.get();
    }

    @GetMapping("/{questionId}")
    public Optional<Question> getAll(@PathVariable Long questionId){
        return questionService.getOne(questionId);
    }


    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionsOfQuiz(@PathVariable Long quizId){
        return questionService.getQuestionsOfQuiz(quizId);
    }

}
