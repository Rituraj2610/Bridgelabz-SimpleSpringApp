package com.rituraj.simpleSpringApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simplespringapp")
public class Home {

    @GetMapping("/hello")
    public void printHello(){
        System.out.println("Hello World");
    }

    @GetMapping("/hello2")
    public String printHello2(){
        return "Hello from Bridgelabz";
    }



}
