package com.springrestcrud.demo;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api")
public class FunRestController {


    private List<Student> list;

   @PostConstruct
   private void setList(){

       list = new ArrayList<>();
       Collections.addAll(list, new Student("Aditya","Goyat"), new Student("Parul", "Goyat"), new Student("Papllu", "Singh"));
   }
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Hello";
    }

    @GetMapping("/students")
    public List<Student> getAll(){
        return list;
    }


    //path variables

    @GetMapping("/students/{studentId}")
    public Student getById(@PathVariable int studentId){
        return list.get(studentId);
    }

}
