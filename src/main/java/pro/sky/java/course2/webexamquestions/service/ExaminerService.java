package pro.sky.java.course2.webexamquestions.service;

import pro.sky.java.course2.webexamquestions.domain.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
