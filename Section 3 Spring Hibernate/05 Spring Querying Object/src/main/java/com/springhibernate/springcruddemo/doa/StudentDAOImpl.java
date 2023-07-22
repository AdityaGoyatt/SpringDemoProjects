package com.springhibernate.springcruddemo.doa;

import com.springhibernate.springcruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public class StudentDAOImpl implements StudentDAO{

    private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student findById(int id) {
        return entityManager.find(Student.class, id);

    }

    @Override
    public List<Student> getAll() {
        List<Student> students = entityManager.createQuery("FROM Student", Student.class).getResultList();
        return students;
    }

    @Override
    public List<Student> getSpecifics() {
        List<Student> studentList = entityManager.createQuery("FROM Student WHERE lastName='Potter'", Student.class).getResultList();
        return studentList;

    }

    @Override
    public List<Student> getByLastName(String paraLastName) {
      var list = entityManager.createQuery("FROM Student WHERE lastName=:parameter", Student.class);
      list.setParameter("parameter", paraLastName);
      return list.getResultList();
    }
}
