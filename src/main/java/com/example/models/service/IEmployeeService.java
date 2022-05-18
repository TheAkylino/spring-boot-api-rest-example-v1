package com.example.models.service;

import com.example.models.entity.Employees;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public interface IEmployeeService {
    List<Employees> allEmployee();
}
