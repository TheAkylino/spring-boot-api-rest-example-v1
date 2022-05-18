package com.example.models.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "employee")
public class Employees {

    @Id
    @Column(name = "employee_ID")
    private String id;

    @Column(name = "first_Name")
    private String firstName;

    @Column(name = "last_Name")
    private String lastName;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "country_Name")
    private String countryName;

    @Column(name = "phone_Number")
    private String phoneNumber;

    @Column(name = "employee_age")
    private String employeeAge;

    @Column(name = "email_Employee")
    private String email;

    @Enumerated(EnumType.STRING)
    private Department department;

    @Column(name = "salary")
    private double salary;
}
