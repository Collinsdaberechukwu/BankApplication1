package com.example.bankapplication1.repository;

import com.example.bankapplication1.Entity.Users;
import com.example.bankapplication1.dto.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users,Long> {
    Users findByUsername(String userName);
}
