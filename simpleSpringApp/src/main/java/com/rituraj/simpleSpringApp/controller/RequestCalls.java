package com.rituraj.simpleSpringApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/requestcalls")
public class RequestCalls {

    @GetMapping
    public String getHello(){
        return "Hello form bridgelabz";
    }




}
