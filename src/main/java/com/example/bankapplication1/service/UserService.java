package com.example.bankapplication1.service;

import com.example.bankapplication1.Entity.Users;
import com.example.bankapplication1.dto.UserDto;

public interface UserService {
    Users createAccount(UserDto userDto)throws RuntimeException;
}
