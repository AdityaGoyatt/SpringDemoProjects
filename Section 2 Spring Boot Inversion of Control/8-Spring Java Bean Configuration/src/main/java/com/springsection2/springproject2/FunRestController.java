package com.springsection2.springproject2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    private String workingStatus;



    @Autowired
public void setWorkingStatus(@Qualifier("swimCoach") Coach coach){
        workingStatus = coach.workStatus();
    }



    @GetMapping("/")
    public String getCurrentStatus(){
        return this.workingStatus;
    }

}
