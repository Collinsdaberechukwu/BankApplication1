package com.example.bankapplication1.Entity;

import com.example.bankapplication1.Enum.Gender;
import com.example.bankapplication1.dto.UserDto;
import com.example.bankapplication1.dtoConverter.MapDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String otherName;
    private Gender gender;
    private String address;
    private String statOfOrigin;
    private String accountNumber;
    private BigDecimal accountBalance;
    private String email;
    private String phoneNumber;
    private String alternativePhoneNumber;
    private String status;

    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime modifiedAt;

    public Users(MapDto userDto) {
        this.firstName = userDto.getFirstName();
        this.lastName = userDto.getLastName();
        this.otherName = userDto.getOtherName();
        this.email = userDto.getEmail();
        this.phoneNumber = userDto.getPhoneNumber();
    }


//    public Users(UserDto userDto) {
//        firstName
//    }
}
