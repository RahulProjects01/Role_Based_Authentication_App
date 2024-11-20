package com.springSecurity.Register_login_spring_security_App.repository;

import com.springSecurity.Register_login_spring_security_App.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

    public User findByEmail(String email);
}
