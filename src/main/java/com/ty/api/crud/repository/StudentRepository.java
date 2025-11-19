package com.ty.api.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.api.crud.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
