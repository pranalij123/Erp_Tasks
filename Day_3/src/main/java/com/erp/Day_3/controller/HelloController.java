package com.erp.Day_3.controller;


import org.springframework.web.bind.annotation.*;
@RestController
public class HelloController {
  

    
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
