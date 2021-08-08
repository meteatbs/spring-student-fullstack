package io.meteatech.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.meteatech.student.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{
	
	
}
