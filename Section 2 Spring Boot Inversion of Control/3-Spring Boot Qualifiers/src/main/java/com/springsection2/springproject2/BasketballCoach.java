package com.springsection2.springproject2;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{
    @Override
    public String workStatus() {
        return "We are working on improving Dunking";
    }
}
