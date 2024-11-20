package com.springSecurity.Register_login_spring_security_App.controller;

import com.springSecurity.Register_login_spring_security_App.entity.User;
import com.springSecurity.Register_login_spring_security_App.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private UserRepo userRepo;

    @GetMapping("/profile")
    public String profile(){
        return "profile";
    }

    @ModelAttribute
    public void commanUser(Principal p, Model model){

        if(p != null){
            String email = p.getName();
            User user = userRepo.findByEmail(email);
            model.addAttribute("user", user);
        }
    }
}
