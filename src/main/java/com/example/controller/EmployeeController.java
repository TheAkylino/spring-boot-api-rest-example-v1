package com.example.controller;

import com.example.models.entity.Employee;
import com.example.models.service.EmployeeService;
import com.example.payloads.generic.GenericBusinessResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.MDC;

import java.util.List;

import static com.example.payloads.constants.Constants.*;
import static com.example.payloads.utils.Utils.*;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    private static final Logger logger = LogManager.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    GenericBusinessResponse response;

    @GetMapping("/allEmployee")
    public ResponseEntity<GenericBusinessResponse> gelAllEmployee(){
        logger.trace("INITIATING THE METHOD OF BRINGING ALL EMPLOYEES");

        String methodName = new Object() {}.getClass().getEnclosingMethod().getName();
        MDC.put("sid", getSessionId());
        MDC.put("client", getClientName());
        MDC.put("methodName", methodName);
        List<Employee> employeeList = employeeService.allEmployee();
        if (employeeList == null) {
            logger.error("AN ERROR HAS OCCURRED, AN EMPTY EMPLOYEE LIST HAS BEEN OBTAINED");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        } else {
            response = GenericBusinessResponse.builder().rc(PROCESS_OK).msg(PROCESS_MSN_OK).obj(employeeList).processedAt(getTime()).build();
            logger.info("INFORMATION SUCCESSFULLY");
            return ResponseEntity.status(HttpStatus.OK).body(response);
        }
    }
}
