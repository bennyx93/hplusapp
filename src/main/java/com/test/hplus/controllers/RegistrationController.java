package com.test.hplus.controllers;

import com.test.hplus.beans.User;
import com.test.hplus.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/registeruser")
    private String registerUser(@ModelAttribute("newuser") User user, Model model) {
        System.out.println("in registration controller");
        userRepository.save(user);
        model.addAttribute("dataSaved", "User data saved successfully");
        return "login";
    }
}
