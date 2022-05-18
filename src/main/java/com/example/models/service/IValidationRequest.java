package com.example.models.service;

import org.springframework.stereotype.Component;

@Component
public interface IValidationRequest {
    public <T> T validateRequest(T t1);
}
