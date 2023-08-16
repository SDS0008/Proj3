package com.example.Student.Ctrl;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Student.Entity.Student_1;
import com.example.Student.Service_logic.Student_service;

@Controller
public class Student_Ctrl {
	
	private Student_service studentService;

	public Student_Ctrl(Student_service studentService) {
		super();
		this.studentService = studentService;
	}
	
	//handler method to handlelist students and return model n view
	
	
	@GetMapping("/students")
	public String listStudents(Model model)
	{
	
		model.addAttribute("students",studentService.getAllStudents());
		return "students";
		
	}
	
	@GetMapping("/students/new")
	public String createStudentform(Model model)
	{
		
		//cretae student obj to hold student form data...
		Student_1 student = new Student_1();
		model.addAttribute("student",student); //"student" is the key and also it has to mention this key in thymleaf obj...
		return "create_student";
		
	}
	
	@PostMapping("/students")
	public String SaveStudent(@ModelAttribute("student") Student_1 student)
	{
		
		studentService.saveStudent(student);
		
		return "redirect:/students";	
	}

	
	@GetMapping("/students/edit/{id}")
	public String editStudentform(@PathVariable Long id,Model model )
	{
	
		model.addAttribute("student",studentService.getStudentbyId(id));
		return "edit_student";
		
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,@ModelAttribute("student")
	
	Student_1 student, Model model)
			
			
	{
		
		//get Student from database by id
		
		Student_1 existingStud = studentService.getStudentbyId(id);
		
		existingStud.setId(student.getId());
		existingStud.setName(student.getName());
		existingStud.setEmail(student.getEmail());
		existingStud.setRollno(student.getRollno());
		
		
		//ssave updated student obj
		
		studentService.updateStudent(existingStud);
		
		
		
		return "redirect:/students" ;
		
		
	}
	
	
	@GetMapping("/students/{id}")
	public String editStudentform(@PathVariable Long id )
	{
	
studentService.DeleteStudentbyid(id);
		return "redirect:/students";
		
	}
	
	
}
