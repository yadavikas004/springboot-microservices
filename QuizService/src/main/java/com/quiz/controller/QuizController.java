package com.quiz.controller;

import com.quiz.entities.Quiz;
import com.quiz.services.QuizService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/quiz")
@AllArgsConstructor
public class QuizController {

    @Autowired
    private QuizService quizService;

    @PostMapping
    public Quiz create(@RequestBody Quiz quiz){
        return quizService.add(quiz);
    }

    @GetMapping
    public List<Quiz> quizList(){
        return quizService.get();
    }

    @GetMapping("/{id}")
    public Quiz quizListById(@PathVariable Long id){
        return quizService.get(id);
    }
}
