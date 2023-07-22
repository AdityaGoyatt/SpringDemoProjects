package com.springrestcrud.demo;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
       if(studentId>=list.toArray().length) throw new RestException("Student not found -"+ studentId);
       return list.get(studentId);
    }




}
