package com.example.models.service.impl;

import com.example.models.entity.Employees;
import com.example.models.repository.EmployeeRepository;
import com.example.models.service.IEmployeeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    private static final Logger logger = LogManager.getLogger(EmployeeServiceImpl.class);

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employees> allEmployee() {
        return (List<Employees>) employeeRepository.findAll();
    }
}
