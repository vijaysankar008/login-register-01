package com.vishalkumar51095.loginregister.repository;


import com.vishalkumar51095.loginregister.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
