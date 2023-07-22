package com.springsection2.springproject2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CricketCoach implements Coach{
    public CricketCoach(){
        System.out.println("Cricket Coach Object created");
    }
    public String workStatus(){
        return "Working on improving balling";
    }
}
