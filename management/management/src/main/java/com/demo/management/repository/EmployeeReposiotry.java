package com.demo.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.management.entity.Employee;



@Repository
public interface EmployeeReposiotry extends JpaRepository<Employee, Integer>{

}
