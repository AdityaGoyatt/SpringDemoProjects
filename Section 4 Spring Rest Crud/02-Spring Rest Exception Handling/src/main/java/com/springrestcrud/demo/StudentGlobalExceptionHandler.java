package com.springrestcrud.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentGlobalExceptionHandler {
//add Exception handling code
@ExceptionHandler()
public ResponseEntity<StudentErrorResponse> exceptionHandler(RestException exception){
    StudentErrorResponse errorObj = new StudentErrorResponse(
            HttpStatus.NOT_FOUND.value(),
            exception.getMessage(),
            System.currentTimeMillis());
    return new ResponseEntity<>(errorObj, HttpStatus.NOT_FOUND);
}

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> genericExceptionHandler(Exception exception){
        StudentErrorResponse errorObj = new StudentErrorResponse(
                HttpStatus.BAD_REQUEST.value(),
                "Something Went Wrong...",
                System.currentTimeMillis());
        return new ResponseEntity<>(errorObj, HttpStatus.BAD_REQUEST);
    }

}
