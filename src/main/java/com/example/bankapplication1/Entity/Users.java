package com.example.bankapplication1.Entity;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data
public class Users {
    private Long id;
    private String firstName;
    private String lastName;
    private String otherName;
    private String gender;
    private String address;
    private String statOfOrigin;
    private String accountNumber;
    private BigDecimal accountBalance;
    private String email;
    private String phoneNumber;
    private String alternativePhoneNumber;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
}
