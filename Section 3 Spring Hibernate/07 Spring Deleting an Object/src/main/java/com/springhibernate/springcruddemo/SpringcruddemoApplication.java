package com.springhibernate.springcruddemo;

import com.springhibernate.springcruddemo.entity.Student;
import com.springhibernate.springcruddemo.doa.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringcruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcruddemoApplication.class, args);
	}

	@Bean
	@Autowired
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner->{
//			createStudent(studentDAO);
//
//			createMultipleStudents(studentDAO);
//
//			//readStudent(studentDAO);
//
//			getAllStudents(studentDAO);


			//getByLastName(studentDAO);

//			updateStudent(studentDAO);
//
//updateAllStudent(studentDAO);
//			System.out.println("list of students before any update");
//
			deleteSingleStudent(studentDAO);
//
			//deleteStudentWithLastName(studentDAO);



		};
	}

	private void deleteStudentWithLastName(StudentDAO studentDAO){
		studentDAO.deleteByLastName("Paplu Ji");

		var list = studentDAO.getAll();
		list.stream().forEach(item-> System.out.println(item));
		System.out.println("THe above is the list of all students!!!");
	}


	private void deleteSingleStudent(StudentDAO studentDAO) {
		studentDAO.delete(13);
		var list = studentDAO.getAll();
		list.stream().forEach(item-> System.out.println(item));

		System.out.println("above is the list of aff students");
	}

	private void updateAllStudent(StudentDAO studentDAO) {
	studentDAO.changeAllLastName("Paplu Ji");

	getAllStudents(studentDAO);

	}
	private void updateStudent(StudentDAO studentDAO) {
		//fetching object

		//find object
		Student fetchedStudent = studentDAO.findById(3);

		//update student

		fetchedStudent.setLastName("Tampu");

		//update

		studentDAO.update(fetchedStudent);

		//print result

		System.out.println(studentDAO.findById(3));
	}

	private void getByLastName(StudentDAO studentDAO) {
		List<Student> list = studentDAO.getSpecifics();

		list.stream().forEach(item-> System.out.println(item));
	}

	private void getAllStudents(StudentDAO studentDAO) {
		//get all students
		List<Student> studentList =  studentDAO.getAll();

		//printing the list
		studentList.stream().forEach(item-> System.out.println(item));
	}

	private void readStudent(StudentDAO studentDAO) {
		//creating the student

		System.out.println("Creating the student");

		Student student = new Student("Papu", "Dobi", "papudobi@001.com");
		System.out.println(student);
		//saving the student
		studentDAO.save(student);

		//fetching the id

		int id  = student.getId();

		System.out.println("the student id is " + id);

		//retriving the student

		Student retrieved = studentDAO.findById(id);
		System.out.println("the retrieved student is "+ retrieved.toString());



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
		Student student = new Student("Pau", "Singh", "paulsmith@001.com");

		//save the student
		studentDAO.save(student);
		//display the id of saved student

		System.out.println("id of student: " + student.getId());

	}

}
