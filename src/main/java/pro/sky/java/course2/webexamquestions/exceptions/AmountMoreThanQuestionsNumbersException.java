package pro.sky.java.course2.webexamquestions.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class AmountMoreThanQuestionsNumbersException extends RuntimeException {

    public AmountMoreThanQuestionsNumbersException(String message) {super(message);}
}
