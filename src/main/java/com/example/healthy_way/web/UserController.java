package com.example.healthy_way.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/login-error")
    public String errorLogin() {
        return "login-error";
    }

    @GetMapping("/register")
    public String register() {

        return "register";
    }
}
