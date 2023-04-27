package com.javasb.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javasb.college.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
