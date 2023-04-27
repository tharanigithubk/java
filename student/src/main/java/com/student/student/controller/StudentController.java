package com.student.student.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.student.student.entity.StudentEntity;
import com.student.student.service.StudentService;

@RestController
public class StudentController {


	@Autowired
	private StudentService studentService;

	@PostMapping("/post")
	private String save(@RequestBody StudentEntity student) {
		studentService.save(student);
		return "ok";
	}
	@GetMapping("/GetById/{id}")
	private Optional<StudentEntity>getById(@PathVariable Integer id) {
		return studentService.getById(id);
	}
	@PutMapping("/create")
	public String update(@RequestBody StudentEntity employee) {
		return studentService.save(employee);
	}
	@DeleteMapping("/create/{id}")
	public void DeleteById(@PathVariable("id")Integer id) {
		  studentService.deleteById(id);
	}
    
}



