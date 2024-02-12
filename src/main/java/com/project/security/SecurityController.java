package com.project.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

    @GetMapping("/login")
    public String showLoginPage(){
        return "employees/login";
    }

    @GetMapping("/access-denied")
    public String showAccessDeniedPage(){
        return "employees/access-denied";
    }
}
