package com.example.Student.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student_1 {
	
@Id
	private long id;

@Column(name = "name",nullable = false)
	private String name;
@Column(name = "email")
	private String email;
@Column(name = "rollno")
	private String rollno;
	
	
	
	public Student_1() {
		super();
	}



	public Student_1(long id, String name, String email, String rollno) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.rollno = rollno;
	}
	
	
	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}






	public void setEmail(String email) {
		this.email = email;
	}



	public String getRollno() {
		return rollno;
	}



	public void setRollno(String rollno) {
		this.rollno = rollno;
	}



}
