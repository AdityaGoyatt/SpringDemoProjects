package com.firstspringprojecte.demo.springproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rest {
    @GetMapping("/")
    public String printHello(){
        return "hello Bemta";
    }

    //endpoint
    @GetMapping("/test")
    public String testing(){
        return "test is working";
    }

    @GetMapping("/fortuner")
    public  String test2(){
        return "Fortuner is a great car";
    }
}
