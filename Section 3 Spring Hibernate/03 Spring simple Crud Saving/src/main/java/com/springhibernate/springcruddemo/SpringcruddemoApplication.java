package com.springhibernate.springcruddemo;

import com.springhibernate.springcruddemo.entity.Student;
import com.springhibernate.springcruddemo.doa.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.SQLOutput;

@SpringBootApplication
public class SpringcruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcruddemoApplication.class, args);
	}

	@Bean
	@Autowired
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner->{
			//createStudent(studentDAO);
			
			createMultipleStudents(studentDAO);
		};
	}

	private void createMultipleStudents(StudentDAO studentDAO) {

		System.out.println("Creating Multiple Students");

		Student student1 = new Student("Parul", "Paplu", "paulsmmmith@001.com");
		Student student2 = new Student("Draco", "Potter", "paulsmith@001.com");
		Student student3 = new Student("Ronald", "Singh", "paulsmith@001.com");

		studentDAO.save(student1);
		studentDAO.save(student2);
		studentDAO.save(student3);


		//saving


	}

	private void createStudent(StudentDAO studentDAO) {
		// create Student object
		System.out.println("creating new student");
		Student student = new Student("Pau", "Smith", "paulsmith@001.com");

		//save the student
		studentDAO.save(student);
		//display the id of saved student

		System.out.println("id of student: " + student.getId());

	}

}
