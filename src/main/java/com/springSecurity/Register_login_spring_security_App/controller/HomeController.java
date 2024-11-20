package com.springSecurity.Register_login_spring_security_App.controller;

import com.springSecurity.Register_login_spring_security_App.entity.User;
import com.springSecurity.Register_login_spring_security_App.repository.UserRepo;
import com.springSecurity.Register_login_spring_security_App.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.security.Principal;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/login")
    public String login() {
        return "loginn";
    }


    @GetMapping("/user/profiles")
    public String profile(Principal principal, Model model) {
        String email = principal.getName();
        User user = userRepo.findByEmail(email);
        model.addAttribute("user", user);
        return "profile";
    }

    @GetMapping("/user/home")
    public String home() {
        return "home";
    }


    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute User user, HttpSession session, RedirectAttributes redirectAttributes) {
        User newUser = userService.saveUser(user);

        if (newUser != null) {
            redirectAttributes.addFlashAttribute("msg", "Registered Successfully!");
        } else {
            redirectAttributes.addFlashAttribute("msg", "Something went wrong on the server!");
        }
        return "redirect:/register";
    }
}
