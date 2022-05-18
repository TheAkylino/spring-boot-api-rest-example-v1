package com.example.payloads.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class GenericExceptionResponse {

    private Date   processedAt;
    private String message;
    private String details;
}
