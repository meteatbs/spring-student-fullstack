package io.meteatech.student.service;

import java.util.List;

import io.meteatech.student.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
