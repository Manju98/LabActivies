package com.librarymanagementsystem.controller;

import javax.validation.Valid; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.librarymanagementsystem.Entity.Student;
import com.librarymanagementsystem.dto.StudentDTO;
import com.librarymanagementsystem.serviceimpl.StudentServiceimpl;

@RestController
public class Controller {
@Autowired
StudentServiceimpl studentservice;
@PostMapping("/students")
ResponseEntity<Student> addStudent(@RequestBody @Valid StudentDTO studentDTO)
{
	return new ResponseEntity<>(studentservice.saveStudent(studentDTO),HttpStatus.CREATED);
}
}
