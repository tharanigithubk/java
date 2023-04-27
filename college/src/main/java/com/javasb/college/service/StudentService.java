package com.javasb.college.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasb.college.entity.Employee;
import com.javasb.college.entity.Student;
import com.javasb.college.repository.EmployeeRepository;
import com.javasb.college.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private EmployeeRepository employeerepository;
	@Autowired
	private StudentRepository studentrepository;
	
	public String save(Employee employee) {
		employeerepository.saveAndFlush(employee);
		return "ok";
	}
	public Employee save(List<Employee>obj1) {
		List<Employee>obj2=new ArrayList<>();
		Employee obj3=null;
		for(Employee obj4:obj1) {
			obj3=new Employee();
			employeerepository.saveAndFlush(obj4);
		}
			return obj3;
		}
		public List<Employee>getAll(){
			return employeerepository.findAll();
		}
		public Optional<Employee>getById(int id){
			return employeerepository.findById(id);
		}
		public String update(Employee employee) {
			employeerepository.saveAndFlush(employee);
			return "update";
		}
		public void delete(int id) {
			employeerepository.deleteById(id);
		}
	}
		