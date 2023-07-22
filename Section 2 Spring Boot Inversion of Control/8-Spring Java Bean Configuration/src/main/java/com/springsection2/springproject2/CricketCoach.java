package com.springsection2.springproject2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //qualifiers are prioritized
public class CricketCoach implements Coach{
    public String workStatus(){
        return "Working on improving balling";
    }
}
