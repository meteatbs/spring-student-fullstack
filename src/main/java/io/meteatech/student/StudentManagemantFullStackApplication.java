package io.meteatech.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.meteatech.student.entity.Student;
import io.meteatech.student.repository.StudentRepository;

@SpringBootApplication
public class StudentManagemantFullStackApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagemantFullStackApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Student student1=new Student("Mete","Atbas","meteatech@gmail.com");
		 * studentRepository.save(student1);
		 * 
		 * Student student2=new Student("Metty","yyuer","meteatbas@io.com");
		 * studentRepository.save(student2);
		 * 
		 * Student student3=new Student("John","Qina","johnQina@qmail.com");
		 * studentRepository.save(student3);
		 */
		
	}

}
