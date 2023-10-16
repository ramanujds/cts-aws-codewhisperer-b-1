package com.cts.quarkus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.quarkus.model.Student;
import com.cts.quarkus.repository.StudentRepository;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	private StudentRepository repo;

	@GetMapping
	public List<Student> getAllStudents(){
		return repo.findAll();
	}
	
	
	@PostMapping
	public Student saveStudent(@RequestBody Student student) {
		return repo.save(student);
	}
	
}
