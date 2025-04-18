package com.rituraj.simpleSpringApp.controller;

import com.rituraj.simpleSpringApp.dto.NameDTO;
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

    @PostMapping
    public String postHello(@RequestBody NameDTO nameDTO){
        return  "Hello from " + nameDTO.getFirstName() + " " + nameDTO.getLastName();
    }


}
