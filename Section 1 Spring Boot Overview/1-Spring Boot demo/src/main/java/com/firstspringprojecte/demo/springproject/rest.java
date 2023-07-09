package com.firstspringprojecte.demo.springproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rest {
    @GetMapping("/")
    public String printHello(){
        return "hello";
    }
}
