package com.rituraj.simpleSpringApp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/requestcalls")
public class RequestCalls {

    @GetMapping
    public String getHello(){
        return "Hello form bridgelabz";
    }

    @GetMapping
    public String getHello1(@RequestParam String name){
        return "Hello form " + name;
    }

    @GetMapping("/{name}")
    public String getHello2(@PathVariable String name){
        return "Hello form " + name;
    }


}
