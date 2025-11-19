package com.ty.api.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.api.crud.dao.StudentDao;
import com.ty.api.crud.model.Student;
import com.ty.api.crud.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentDao studentdao;
	
	@Autowired
	StudentRepository studentRepository;
	
	public String addStudent(Student student) {
		return studentdao.addStudent(student);
	}
	
	public String addStudents(List<Student> list) {
		return studentdao.addStudents(list);
	}
	
	public Object fetchStudent(int id) {
		Optional<Student>optional=studentdao.fetchStudent(id);
		if (optional.isPresent()) {
			return optional.get();
		}else {
			return "No data found";
		}
				
	}
	
	public List<Student> fetchAllStudent() {
		List<Student> list=studentdao.fetchAllStudent();
		if(list.isEmpty()) {
			return null;
		}
		else {
			return list;
		}
	}
	
	public String editStudent(Student student) {
		Optional<Student> o = studentdao.fetchStudent(student.getId());
		if (o.isPresent()) {
			studentRepository.save(student);
			return "updated";
		} else
			return "no data found with id " + student.getId();
	}
	

	
	public String removeStudent(int id) {
		Optional<Student> os = studentdao.fetchStudent(id);
		if (os.isPresent()) {
			studentRepository.deleteById(id);
			return "data deleted";
		} else
			return "no data found";
	}

	public String removeAllStudent() {
		List<Student> list = studentdao.fetchAllStudent();
		if (list.isEmpty())
			return "no data found";
		else
			studentRepository.deleteAll();
		return "data deleted";
	}



}
