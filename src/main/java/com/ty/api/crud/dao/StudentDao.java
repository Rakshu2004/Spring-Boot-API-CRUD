package com.ty.api.crud.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.api.crud.model.Student;
import com.ty.api.crud.repository.StudentRepository;

@Repository
public class StudentDao {
	@Autowired
	StudentRepository studentrepository;
	
	public String addStudent(Student student) {
		studentrepository.save(student);
		return "data inserted";
	}
	public String addStudents(List<Student> list) {
		 studentrepository.saveAll(list);
		 return "saved";
	}
	public Optional<Student> fetchStudent(int id) {
		Optional<Student>os=studentrepository.findById(id);
		return os;
	}
	
	public List<Student> fetchAllStudent()
	{
		List<Student>list=studentrepository.findAll();
		return list;
	}
	
	
	}
	
	
	


