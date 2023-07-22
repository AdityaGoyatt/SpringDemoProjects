package com.springrestrealproject.demo.dao;

import com.springrestrealproject.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee getById(int id);

    Employee save(Employee employee);

    void delete(int id);
}
