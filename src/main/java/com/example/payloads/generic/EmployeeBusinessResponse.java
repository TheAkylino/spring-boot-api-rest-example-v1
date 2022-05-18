package com.example.payloads.generic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@EqualsAndHashCode(callSuper=false)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeBusinessResponse<T> {
    private String rc;
    private String msg;
    private T employee;
    private String processedAt;
}
