package com.example.bankapplication1.service.ServiceImplementation;

import com.example.bankapplication1.Entity.Users;
import com.example.bankapplication1.dtoConverter.MapDto;
import com.example.bankapplication1.repository.UsersRepository;
import com.example.bankapplication1.service.UserService;
import org.springframework.stereotype.Service;

//@RequiredArgsConstructor
@Service
public class BanksImplement implements UserService {
    private final UsersRepository usersRepository;


    public BanksImplement(UsersRepository usersRepository)throws RuntimeException {
        this.usersRepository = usersRepository;
//        this.repos = repos;
    }

    @Override
    public Users createAccount(MapDto userDto) {
       return usersRepository.save(new Users(userDto));
    }
//        Users newUsers = new Users();
//        newUsers.setFirstName(userDto.getFirstName());
//        newUsers.setLastName(userDto.getLastName());
//        newUsers.setGender(userDto.getGender());
//        newUsers.setAddress(userDto.getAddress());
//        newUsers.setAlternativePhoneNumber(userDto.getAlternativePhoneNumber());
//        newUsers.setStatOfOrigin(userDto.getStatOfOrigin());
//        newUsers.setOtherName(userDto.getOtherName());
//        newUsers.setStatus(userDto.getStatus());
//
//        Users addedUsers = usersRepository.save(newUsers);
//        return addedUsers;

    }

//    @Override
//    public Users getAllUsers(UserDto userDto) {
//        usersRepository.findById(userDto);
//        return getAllUsers(userDto);


