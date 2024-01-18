package com.hidarisoft.mxprevlist.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
@Slf4j
public class DefaultExceptionHandler {

    @ExceptionHandler({MethodArgumentNotValidException.class})
    public ResponseEntity<GenericErrorResponse> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {

        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach(objectError -> {
            String fieldName = ((FieldError) objectError).getField();
            String errorMessage = objectError.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });


        GenericErrorResponse genericErrorResponse = GenericErrorResponse.builder()
                .httpStatus(HttpStatus.BAD_REQUEST)
                .httpStatusCode(HttpStatus.BAD_REQUEST.value())
                .title("Unable to process Request")
                .message("Unable to process request, Check details field")
                .details(errors).build();

        log.error("Fields Incorrect: {}", errors);

        return ResponseEntity.status(genericErrorResponse.getHttpStatus()).body(genericErrorResponse);
    }
}
