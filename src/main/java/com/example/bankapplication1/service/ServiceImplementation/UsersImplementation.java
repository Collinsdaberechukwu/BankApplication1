package com.example.bankapplication1.service.ServiceImplementation;

import com.example.bankapplication1.Entity.Users;
import com.example.bankapplication1.dto.UserDto;
import com.example.bankapplication1.repository.UsersRepository;
import com.example.bankapplication1.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UsersImplementation implements UserService {
    private final UsersRepository usersRepository;

    public UsersImplementation(UsersRepository usersRepository)throws RuntimeException {
        this.usersRepository = usersRepository;
    }

    @Override
    public Users createAccount(UserDto userDto) {
        Users newUsers = new Users();
        newUsers.setFirstName(userDto.getFirstName());
        newUsers.setLastName(userDto.getLastName());
        newUsers.setGender(userDto.getGender());
        newUsers.setAddress(userDto.getAddress());
        newUsers.setAlternativePhoneNumber(userDto.getAlternativePhoneNumber());
        newUsers.setStatOfOrigin(userDto.getStatOfOrigin());
        newUsers.setOtherName(userDto.getOtherName());
        newUsers.setStatus(userDto.getStatus());

        Users addedUsers = usersRepository.save(newUsers);
        return addedUsers;

    }
}
