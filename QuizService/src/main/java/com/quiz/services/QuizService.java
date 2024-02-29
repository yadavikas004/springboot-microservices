package com.quiz.services;

import com.quiz.entities.Quiz;

import java.util.List;
import java.util.Optional;

public interface QuizService {

    Quiz add(Quiz quiz);

    List<Quiz> get();

    Quiz get(Long id);
}
