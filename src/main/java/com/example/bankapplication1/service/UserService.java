package com.example.bankapplication1.service;

import com.example.bankapplication1.Entity.Users;
import com.example.bankapplication1.dtoConverter.MapDto;

public interface UserService {
    Users createAccount(MapDto userDto)throws RuntimeException;
//    Users getAllUsers(UserDto userDto);
}
