package com.example.payloads.request;

import com.example.models.entity.Department;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class EmployeeRequest {
    private String id;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String countryName;
    private String phoneNumber;
    private String employeeAge;
    private String email;
    private Department department;
    private double salary;
}
