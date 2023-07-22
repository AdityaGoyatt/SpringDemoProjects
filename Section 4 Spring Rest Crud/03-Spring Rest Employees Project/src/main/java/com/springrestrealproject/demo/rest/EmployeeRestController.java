package com.springrestrealproject.demo.rest;

import com.springrestrealproject.demo.dao.EmployeeDAO;
import com.springrestrealproject.demo.dao.EmployeeService;
import com.springrestrealproject.demo.dao.EmployeeServiceImpl;
import com.springrestrealproject.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;


    @Autowired
    public EmployeeRestController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getAll(){
    return employeeService.findAll();
    }


    @GetMapping("/employees/{employeeId}")
    public  Employee getEmployee(@PathVariable int employeeId ){
        Employee employee = employeeService.getById(employeeId);
        if(employee==null) throw new RuntimeException("Employee not found - "+ employeeId);
        return employee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        //in case they set id to employee
        employee.setId(0);

        Employee dbEmployee = employeeService.save(employee);
        return dbEmployee;

    }




}
