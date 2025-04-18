package com.rituraj.simpleSpringApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simplespringapp")
public class Home {

    @GetMapping("/hello")
    public String printHello(){
        return "Hello World";
    }
}
