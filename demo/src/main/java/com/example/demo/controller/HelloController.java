package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @Value("${greeting.message}")
    private String message;

    @GetMapping("/")
    public String sayHello(Model model) {
        model.addAttribute("message", message);
        return "hello";
    }
}
