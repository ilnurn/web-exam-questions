package pro.sky.java.course2.webexamquestions.service;

import pro.sky.java.course2.webexamquestions.domain.Question;

import java.util.Collection;

public interface QuestionService {
    Question add(String question, String answer);

    Question remove(Question question);

    Collection<Question> getAll();

    Question getRandomQuestion(int amount);
}
