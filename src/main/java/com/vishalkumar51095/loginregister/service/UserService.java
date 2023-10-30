package com.vishalkumar51095.loginregister.service;


import com.vishalkumar51095.loginregister.dto.UserDto;
import com.vishalkumar51095.loginregister.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
