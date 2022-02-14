package com.test.hplus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedirectionController {

    @GetMapping("/redirectToLinkedin")
    public String redirectOut() {
        System.out.println("in redirecting controller");
        return "redirect:https://www.linkedin.com";
    }
}
