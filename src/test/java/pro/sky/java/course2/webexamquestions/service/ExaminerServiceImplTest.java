package pro.sky.java.course2.webexamquestions.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.java.course2.webexamquestions.domain.Question;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

import static pro.sky.java.course2.webexamquestions.constants.TestConstants.*;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceImplTest {

    @Mock
    private QuestionService questionServiceMock;

    @InjectMocks
    private ExaminerServiceImpl out;

    @Test
    public void ShouldGetQuestions() {
        when(questionServiceMock.getRandomQuestion(1))
                .thenReturn(new Question(QUESTION1, ANSWER1));
        assertIterableEquals(out.getQuestions(1), QUESTION_AND_ANSWER_IN_LIST);
    }
}
