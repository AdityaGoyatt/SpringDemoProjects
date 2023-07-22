package com.springsection2.springproject2;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{
    //testing bean Construction
    public BasketballCoach(){
        System.out.println("BasketBall Coach Created");
    }
    @Override
    public String workStatus() {
        return "We are working on improving Dunking";
    }
}
