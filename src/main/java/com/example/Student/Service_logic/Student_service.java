package com.example.Student.Service_logic;

import java.util.List;

import com.example.Student.Entity.Student_1;

public interface Student_service {

	List<Student_1> getAllStudents();
	

	Student_1 saveStudent(Student_1 student);
	

	
	Student_1 getStudentbyId(Long id);



	
	Student_1 updateStudent(Student_1 stud);


	

	void DeleteStudentbyid(Long id);


	
}
