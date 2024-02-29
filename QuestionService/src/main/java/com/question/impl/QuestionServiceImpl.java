package com.question.impl;

import com.question.entities.Question;
import com.question.repositories.QuestionRepository;
import com.question.services.QuestionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public Question create(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> get() {
        return questionRepository.findAll();
    }

    @Override
    public Optional<Question> getOne(Long id) {
        return Optional.ofNullable(questionRepository.findById(id).orElseThrow(() -> new RuntimeException("Question Not Found")));
    }

    @Override
    public List<Question> getQuestionsOfQuiz(Long quizId) {
        return  questionRepository.findByQuizId(quizId);
    }
}
