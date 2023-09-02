package com.example.bankapplication1.dtoConverter;

import com.example.bankapplication1.Enum.Gender;
import com.example.bankapplication1.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class MapDto {
    private String firstName;
    private String lastName;
    private String otherName;
    private Gender gender;
    private String address;
    private String statOfOrigin;
    private String email;
    private String phoneNumber;


    public MapDto(MapDto mapDto) {
        this.firstName =mapDto.getFirstName();
        this.lastName = mapDto.getLastName();
        this.otherName = mapDto.getOtherName();
        this.gender = mapDto.getGender();
        this.address = mapDto.getAddress();
        this.statOfOrigin = mapDto.getStatOfOrigin();
        this.email = mapDto.getEmail();
        this.phoneNumber = mapDto.getPhoneNumber();
    }
}
