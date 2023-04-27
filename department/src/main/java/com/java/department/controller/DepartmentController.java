package com.java.department.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.department.entity.Depatrment;
import com.java.department.service.Department;
import com.java.department.service.DepartmentService;

@RestController

public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/departments")
	public Depatrment saveDepartment(@Validated @RequestBody Depatrment department) {
		return departmentService.saveDepatrment(department);
	}

	@GetMapping("/departments")
	public List<Depatrment> fetchDepartmentList() {
		return departmentService.fetchDepartmentList();
	}

	@PutMapping("/departments/{id}")
	public Department updateDepartment(@RequestBody Depatrment department,
			@PathVariable("id") Long departmentId) {
		return departmentService.updateDepartment(department,departmentId);
	}

	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
		departmentService.deleteDepartmentById(departmentId);
		return "Delete Successfully";
	}

}
