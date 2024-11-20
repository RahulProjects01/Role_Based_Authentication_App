package com.springSecurity.Register_login_spring_security_App.service;

import com.springSecurity.Register_login_spring_security_App.entity.User;

public interface UserService {

    public User saveUser(User user);
    public  void removeSessionMessage();
}
