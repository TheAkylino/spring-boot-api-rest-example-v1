package com.example.controller;

import com.example.models.entity.Employees;
import com.example.models.service.IEmployeeService;
//import com.example.payloads.generic.GenericBusinessResponse;
import com.example.models.service.IValidationRequest;
import com.example.payloads.generic.EmployeeBusinessResponse;
import com.example.payloads.generic.EmployeesBusinessResponse;
import com.example.payloads.request.EmployeeRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.payloads.constants.Constants.PROCESS_MSN_OK;
import static com.example.payloads.constants.Constants.PROCESS_OK;
import static com.example.payloads.utils.Utils.*;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    private static final Logger logger = LogManager.getLogger(EmployeeController.class);

    @Autowired
    private IEmployeeService iEmployeeService;

    @Autowired
    private IValidationRequest iValidationRequest;

    private EmployeesBusinessResponse responseEmployees;

    @GetMapping("/allEmployee")
    public ResponseEntity<EmployeesBusinessResponse> gelAllEmployee() {
        logger.trace("INITIATING THE METHOD OF BRINGING ALL EMPLOYEES");

        String methodName = new Object() {}.getClass().getEnclosingMethod().getName();
        MDC.put("sid", getSessionId());MDC.put("client", getClientName());MDC.put("methodName", methodName);

        List<Employees> employeesList = iEmployeeService.allEmployee();
        if (employeesList == null) {
            logger.error("AN ERROR HAS OCCURRED, AN EMPTY EMPLOYEE LIST HAS BEEN OBTAINED");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseEmployees);
        } else {
            responseEmployees = EmployeesBusinessResponse.builder().rc(PROCESS_OK)
                    .msg(PROCESS_MSN_OK).employees(employeesList).processedAt(getTime()).build();
            logger.info("INFORMATION SUCCESSFULLY");
            return ResponseEntity.status(HttpStatus.OK).body(responseEmployees);
        }
    }

    @PostMapping("/addEmployee")
    public ResponseEntity<EmployeesBusinessResponse> addEmployee(@RequestBody EmployeeRequest employeeRequest) {
        logger.trace("INITIATING THE METHOD OF BRINGING ALL EMPLOYEES");

        String methodName = new Object() {}.getClass().getEnclosingMethod().getName();
        MDC.put("sid", getSessionId());MDC.put("client", getClientName());MDC.put("methodName", methodName);




        return null;
    }

}
