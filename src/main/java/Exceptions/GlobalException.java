package Exceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(Invalid.class)
    public ResponseExce InvalidExce(Exception response){
        return new ResponseExce(response.getMessage());
    }

}