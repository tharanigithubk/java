package com.javasb.college.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javasb.college.entity.Employee;
import com.javasb.college.entity.Student;
import com.javasb.college.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentservice;
	
	@PostMapping("/college")
	private String save(@RequestBody Employee employee) {
		studentservice.save(employee);
		return "done";
	}
	@PostMapping("/ListAll")
	private String ListAll(@RequestBody List<Employee>obj1) {
		Employee obj2=studentservice.save(obj1);
		return "listall";
	}
    @GetMapping("/getin")
    private List<Employee>getAll(){
    	return studentservice.getAll();
    }
    @GetMapping("/get/{id}")
    private Optional<Employee>getId(@PathVariable("id")int id){
    	return studentservice.getById(id);
    }
    @PutMapping("save")
    private String update(@RequestBody Employee student) {
    	studentservice.update(student);
    	return "save";
    }
    @DeleteMapping("/delete/{id}")
    private void deleteId(@PathVariable("id")int id) {
    	studentservice.delete(id);
    }
}
