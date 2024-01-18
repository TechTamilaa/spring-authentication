package com.example.employee.repository;


import com.example.employee.model.PasswordResetToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenReposirory extends JpaRepository<PasswordResetToken,Integer> {
    PasswordResetToken findByToken(String token);
}
