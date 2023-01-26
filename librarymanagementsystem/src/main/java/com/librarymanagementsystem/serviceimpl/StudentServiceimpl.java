package com.librarymanagementsystem.serviceimpl;

import java.util.ArrayList;  
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarymanagementsystem.Entity.Book;
import com.librarymanagementsystem.Entity.Student;
import com.librarymanagementsystem.dto.StudentDTO;
import com.librarymanagementsystem.repository.StudentRepository;
import com.librarymanagementsystem.service.StudentService;
@Service
public class StudentServiceimpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;


	public Student saveStudent(StudentDTO studentDTO) {
	 Student student=Student.builder().studentName(studentDTO.getStudentName())
			 .studentAge(studentDTO.getStudentAge())
			 .build();
		return studentRepository.save(student);
	}

	
}
