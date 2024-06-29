package pl.jaz.s29097.nbp.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler({Exception.class})
    public void handleException(Exception ex) {
        System.out.println("Exception: " + ex.getMessage());
    }
}