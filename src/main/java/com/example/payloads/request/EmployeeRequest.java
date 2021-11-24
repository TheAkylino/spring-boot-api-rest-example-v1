package com.example.payloads.request;

import com.example.models.entity.Department;
import lombok.*;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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

    @NotBlank
    @NotNull
    private String firstName;
    @NotBlank
    @NotNull
    private String lastname;
    @NotBlank
    @NotNull
    private String phoneNumber;
    @Email
    private String email;
    @NotBlank
    @NotNull
    private double salary;
    @NotBlank
    @NotNull
    @Enumerated(EnumType.STRING)
    private Department department;
}
