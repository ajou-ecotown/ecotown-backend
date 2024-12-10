package com.echotown.common.exception;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler({CustomException.class})
    protected ResponseEntity handleCustomException(HttpServletRequest request, CustomException ex) {
        CustomExceptionInfo customErrorInfo = ex.getCustomExceptionInfo();

        CustomExceptionResponse exceptionResponse = CustomExceptionResponse.builder()
                .statusCode(customErrorInfo.getStatusCode())
                .data(customErrorInfo.getData())
                .build();

        log.error("\tException at {}", request.getRequestURI());
        log.error("\tException message: {}", ex.getMessage());

        return ResponseEntity
                .status(customErrorInfo.getStatusCode())
                .body(exceptionResponse.data());
    }
}
