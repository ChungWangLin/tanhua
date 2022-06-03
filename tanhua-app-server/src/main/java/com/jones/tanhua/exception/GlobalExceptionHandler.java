package com.jones.tanhua.exception;

import com.jones.tanhua.response.FailResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = CustomerException.class)
    public FailResponse CustomerExceptionHandler(CustomerException e) {
        String code = e.getCode();
        String message = e.getMessage();
        return new FailResponse(code,message);
    }
}
