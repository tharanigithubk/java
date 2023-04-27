package com.demo.management.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.management.entity.Employee;
import com.demo.management.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	@PostMapping("/create")
	public Employee create(@RequestBody Employee employee) {
		return service.saveEmployee(employee);
	}
	@GetMapping("/create/{id}")
	public Optional<Employee>getById(@PathVariable("id")Integer id){
		 return service.getById(id);
	}
	@PutMapping("/create")
	public Employee update(@RequestBody Employee employee) {
		return service.saveEmployee(employee);
	}
	@DeleteMapping("/create/{id}")
	public void  deleteById(@PathVariable("id")Integer id) {
		 service.deleteById(id);
	}

}


