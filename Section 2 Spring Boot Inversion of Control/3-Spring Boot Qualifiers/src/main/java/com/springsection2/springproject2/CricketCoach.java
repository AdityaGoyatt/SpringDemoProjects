package com.springsection2.springproject2;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public String workStatus(){
        return "Working on improving balling";
    }

}
