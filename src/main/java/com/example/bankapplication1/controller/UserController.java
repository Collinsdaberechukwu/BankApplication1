package com.example.bankapplication1.controller;


import com.example.bankapplication1.Entity.Users;
import com.example.bankapplication1.dto.UserDto;
import com.example.bankapplication1.dtoConverter.MapDto;
import com.example.bankapplication1.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/register")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
//    @GetMapping("get")
//    public ResponseEntity<UserDto> getUser(@RequestBody UserDto userDto){
//        userService.getAllUsers(userDto);
//        return new ResponseEntity<>(userDto,HttpStatus.OK);
//    }

    @PostMapping("/create")
    public ResponseEntity<MapDto> createAccount(@RequestBody MapDto mapDto){
        userService.createAccount(mapDto);
        return new ResponseEntity<>(mapDto, HttpStatus.CREATED);
//        return new ResponseEntity.ok(userDto);
    }
}
