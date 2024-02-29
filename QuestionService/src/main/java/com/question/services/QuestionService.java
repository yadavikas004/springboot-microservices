package com.question.services;

import com.question.entities.Question;

import java.util.List;
import java.util.Optional;

public interface QuestionService {

    Question create(Question question);

    List<Question> get();

    Optional<Question> getOne(Long id);

    List<Question> getQuestionsOfQuiz(Long quizId);
}
