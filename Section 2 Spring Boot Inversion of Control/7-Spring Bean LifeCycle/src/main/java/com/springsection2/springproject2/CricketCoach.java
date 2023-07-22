package com.springsection2.springproject2;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //qualifiers are prioritized
public class CricketCoach implements Coach{
    public String workStatus(){
        return "Working on improving balling";
    }

    @PostConstruct
    public void doThisStuff(){
        System.out.println("the Post Construct Working as: " + getClass().getSimpleName());
    }


    @PreDestroy
    public void doSomeMoreStuff(){
        System.out.println("the Pre destruction is Working as: " + getClass().getSimpleName());
    }
}
