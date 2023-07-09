package com.firstspringprojecte.demo.springproject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rest {

    //using App Variables
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;


    //inject app properties using @Value annotations


   //endpoint for demo of application properties injection
    @GetMapping("/AppProperties")
    public String displayAppProperties(){
        return "name:" +coachName  + " team: "+teamName;
    }



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
