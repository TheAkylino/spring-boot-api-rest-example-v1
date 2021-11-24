package com.example.models.service.impl;

import com.example.models.entity.Employee;
import com.example.models.repository.EmployeeRepository;
import com.example.models.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> allEmployee() {
        return employeeRepository.findAll();
    }
}
