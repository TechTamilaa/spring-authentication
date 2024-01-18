package com.example.employee.service;


import com.example.employee.dto.UserDto;
import com.example.employee.model.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
