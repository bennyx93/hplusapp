package com.test.hplus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LogoutController {

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        System.out.println("ending user session");
        session.invalidate();
        // Error since the session is not valid anymore
//        System.out.println(session.getAttribute("login"));
        return "login";
    }
}
