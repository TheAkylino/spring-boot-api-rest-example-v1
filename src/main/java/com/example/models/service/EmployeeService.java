package com.example.models.service;

import com.example.models.entity.Employee;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public interface EmployeeService {
    List<Employee> allEmployee();
}
