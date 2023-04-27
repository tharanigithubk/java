package com.student.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.student.entity.StudentEntity;

@Repository

public interface StudentRepository extends JpaRepository<StudentEntity,Integer>{

}
