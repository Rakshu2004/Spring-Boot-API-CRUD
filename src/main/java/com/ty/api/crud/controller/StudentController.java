package com.ty.api.crud.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.api.crud.model.Student;
import com.ty.api.crud.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentService studentservice;

	@PostMapping
	public String addStudent(@RequestBody Student student) {
		return studentservice.addStudent(student);
//		System.out.println(student);
//		return student;
	}
	
	@PostMapping("/all")
	public String addStudents(@RequestBody List<Student> list) {
		return studentservice.addStudents(list);
	}
	
	@DeleteMapping("/id/{pk}")
	public String removeStudent(@PathVariable int pk) {
		return studentservice.removeStudent(pk);
	}

	@DeleteMapping
	public String removeAllStudent() {
		return studentservice.removeAllStudent();
	}
	
	@GetMapping("/id/{a}")
	public Object fetchStudent(@PathVariable int a) {
		Object o=studentservice.fetchStudent(a);
		return o;
		
	}
	
	@GetMapping
	//return type Object also applies for this and service methods
	public List<Student> fetchAllStudent() {
		return studentservice.fetchAllStudent();
		
	}
	
	@PutMapping
	public String editStudent(@RequestBody Student student) {
		return studentservice.editStudent(student);
	}
	
}