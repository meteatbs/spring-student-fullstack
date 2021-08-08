package io.meteatech.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import io.meteatech.student.entity.Student;
import io.meteatech.student.service.StudentService;

@Controller
public class StudentController {
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	
	//handler method to handle list students and return mode and view
	@GetMapping("/students")
	public String listStudent(Model model) {
		
		model.addAttribute("students",studentService.getAllStudents());
		//this view goes to templates/students.html
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		//create object for form data
		Student student=new Student();
		model.addAttribute("student",student);
		
		return "create_student";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id,Model model) {
		model.addAttribute("student",studentService.getStudentById(id));
		return "edit_student";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id ,@ModelAttribute("student") Student student, Model model) {
		//get object from db by id
		
		Student currentStudent=studentService.getStudentById(id);
		currentStudent.setId(id);
		currentStudent.setFirstName(student.getFirstName());
		currentStudent.setLastName(student.getLastName());
		currentStudent.setEmail(student.getEmail());
		
		//save object to database
		
		studentService.updateStudent(currentStudent);
		return "redirect:/students";
	}
	
	//handler delete student object
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudentById(id);
		return "redirect:/students";
	}
	
}
