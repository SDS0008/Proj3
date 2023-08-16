package com.example.Student.Service_logic.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Student.Entity.Student_1;
import com.example.Student.Repository.StudentREpository;

import com.example.Student.Service_logic.Student_service;

@Service
public class StudentServiceimpl implements Student_service {

	
	private StudentREpository studentREpository;
	
	public StudentServiceimpl(StudentREpository studentREpository) {
		super();
		this.studentREpository = studentREpository;
	}


	@Override
	public List<Student_1> getAllStudents() {
		// TODO Auto-generated method stub
		
		return studentREpository.findAll();
	}


	@Override
	public Student_1 saveStudent(Student_1 student) {
		// TODO Auto-generated method stub
		return studentREpository.save(student);
	}


	@Override
	public Student_1 getStudentbyId(Long id) {
		// TODO Auto-generated method stub
		return studentREpository.findById(id).get();
	}


	@Override
	public Student_1 updateStudent(Student_1 stud) {
		// TODO Auto-generated method stub
		return studentREpository.save(stud);
	}


	@Override
	public void DeleteStudentbyid(Long id) {
		// TODO Auto-generated method stub
		
		
		studentREpository.deleteById(id);
	}




}
