package com.vishalkumar51095.loginregister.repository;


import com.vishalkumar51095.loginregister.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
