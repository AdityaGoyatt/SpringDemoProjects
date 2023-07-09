package com.springsection2.springproject2;


import org.springframework.stereotype.Component;

@Component
public class CoachVancouver implements CoachInterface{

    @Override
    public String workOutStatus() {
        return "We are Working Out";
    }
}
