package com.example.bankapplication1.dto;

import com.example.bankapplication1.Enum.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String firstName;
    private String lastName;
    private String otherName;
    private Gender gender;
    private String address;
    private String statOfOrigin;
    private String email;
    private String phoneNumber;
    private String alternativePhoneNumber;
    private String status;
}
