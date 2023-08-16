package com.example.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Student.Entity.Student_1;
import com.example.Student.Repository.StudentREpository;

@SpringBootApplication
public class StudentsManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentsManagementApplication.class, args);
	}

	@Autowired
	private StudentREpository studentrepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		/*
		Student_1 student1 = new Student_1(5,"sds","sds@gmail.com","y18me3248");
		studentrepo.save(student1);
		

		
		Student_1 student2 = new Student_1(6,"sds5","sds54@gmail.com","y18mee3248");
		studentrepo.save(student2);
	*/	
		
	}

}
