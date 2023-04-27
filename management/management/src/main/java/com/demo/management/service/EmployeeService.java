package com.demo.management.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.management.entity.Employee;
import com.demo.management.repository.EmployeeReposiotry;

@Service
public class EmployeeService {
	
	@Autowired
  public EmployeeReposiotry repo;

	public Employee saveEmployee(Employee employee) {
		 return repo.save(employee);
	}
	public Optional<Employee>getById(Integer id){
		return repo.findById(id);
	}
	public void  deleteById(Integer id){
		 repo.deleteById(id);
	}

}
