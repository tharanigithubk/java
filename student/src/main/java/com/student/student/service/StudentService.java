package com.student.student.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.student.entity.StudentEntity;
import com.student.student.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public String save(StudentEntity student) {
		studentRepository.saveAndFlush(student);
		return "saved";
	}
	public Optional<StudentEntity> getById(Integer id) {
		return studentRepository.findById(id);
	}
	public void deleteById (Integer id) {
		 studentRepository.deleteById(id);
	}

	
}
