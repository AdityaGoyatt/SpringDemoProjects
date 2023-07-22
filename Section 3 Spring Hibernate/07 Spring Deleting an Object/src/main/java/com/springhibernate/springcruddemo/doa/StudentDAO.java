package com.springhibernate.springcruddemo.doa;

import com.springhibernate.springcruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student student);

    Student findById(int id);

    List<Student> getAll();

    List<Student> getSpecifics();

    void update(Student student);

    void changeAllLastName(String newLastName);

    void delete(int id);

    void deleteByLastName(String givenLastName);
}
