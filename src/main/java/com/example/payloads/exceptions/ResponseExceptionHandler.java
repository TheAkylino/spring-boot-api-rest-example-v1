package com.example.payloads.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

public class ResponseExceptionHandler extends ResponseEntityExceptionHandler {

    public final ResponseEntity<Object> exception(EmployeeNotFoundException ex, WebRequest request){
        GenericExceptionResponse exceptionResponse = new GenericExceptionResponse(new Date(),ex.getMessage(),request.getDescription(false));
        return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
    }
}
