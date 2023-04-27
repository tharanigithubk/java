package com.javasb.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javasb.college.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	

}
