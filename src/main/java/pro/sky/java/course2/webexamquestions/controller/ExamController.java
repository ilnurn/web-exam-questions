package pro.sky.java.course2.webexamquestions.controller;

import org.springframework.web.bind.annotation.*;
import pro.sky.java.course2.webexamquestions.domain.Question;
import pro.sky.java.course2.webexamquestions.service.ExaminerService;

import java.util.Collection;

@RestController
@RequestMapping("exam")
public class ExamController {

    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping("/get/{amount}")
    public Collection<Question> getQuestions(@PathVariable int amount) {
        return examinerService.getQuestions(amount);
    }
}
