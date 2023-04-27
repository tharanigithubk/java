package com.java.department.service;

import java.util.List;

import com.java.department.entity.Depatrment;

public interface DepartmentService {
	Depatrment saveDepartment(Department department);
	List<Depatrment> fetchDepartmentList();
	Department updateDepartment(Depatrment department,Long departmentId);
	void deleteDepartmentById(Long departmentId);
	Depatrment saveDepatrment(Depatrment departmentService);
}




	








