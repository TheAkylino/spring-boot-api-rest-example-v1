package com.example.models.service.impl;

import com.example.models.service.IValidationRequest;
import com.example.payloads.request.EmployeeRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class ValidationRequestImpl implements IValidationRequest {

    private static final Logger logger = LogManager.getLogger(ValidationRequestImpl.class);
    private Object valvalidatedObjectidate;
    private EmployeeRequest request;

    @Override
    public <T> T validateRequest(T t1) {
        if (t1 instanceof EmployeeRequest) {
            request = (EmployeeRequest) t1;
            valvalidatedObjectidate = validateEmployeeRequest(request);
        }
        return (T) valvalidatedObjectidate;
    }

    private Object validateEmployeeRequest(EmployeeRequest request) {
        logger.info("EMPLOYEE REQUEST");
        if (request != null) {
            logger.info("NO SOY NULL");
        }
        return request;
    }
}
