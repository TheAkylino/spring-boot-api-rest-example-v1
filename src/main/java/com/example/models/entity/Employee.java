package com.example.models.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_Name")
    private String firstName;

    @Column(name = "last_Name")
    private String lastName;

    @Column(name = "phone_Number")
    private String phoneNumber;

    @Column(name = "email_Employee")
    private String email;

    @Column(name = "salary")
    private double salary;

    @Enumerated(EnumType.STRING)
    private Department department;
}
