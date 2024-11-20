package com.springSecurity.Register_login_spring_security_App.controller;

import com.springSecurity.Register_login_spring_security_App.entity.User;
import com.springSecurity.Register_login_spring_security_App.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/admin/")
public class AdminController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/profile")
    public String profile(){

        return "admin_profile";
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
