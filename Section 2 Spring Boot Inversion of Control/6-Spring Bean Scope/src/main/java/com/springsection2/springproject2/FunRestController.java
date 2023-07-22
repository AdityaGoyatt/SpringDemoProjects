package com.springsection2.springproject2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    private Coach firstCoach;
    private Coach secondCoach;




    @Autowired
    public void setCoach(Coach fstCoach, Coach secndCoach){
        firstCoach = fstCoach;
        secondCoach = secndCoach;
    }

    //test for singleton
    @GetMapping("/Scope")
    public String getScope(){
        return "The first coach and the second coach are singleton ?   "  + (firstCoach==secondCoach);
    }


    @GetMapping("/")
    public String getCurrentStatus(){
        return secondCoach.workStatus();
    }

}
