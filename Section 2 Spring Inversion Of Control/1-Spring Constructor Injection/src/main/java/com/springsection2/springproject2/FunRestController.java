package com.springsection2.springproject2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    private String workingStatus;

    @Autowired
    public FunRestController(CoachInterface coach){
        this.workingStatus = coach.workOutStatus();
    }

    @GetMapping("/")
    public String getCurrentStatus(){
        return this.workingStatus;
    }

}
