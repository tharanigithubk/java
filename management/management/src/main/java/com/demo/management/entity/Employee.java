package com.demo.management.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "employee")
public class Employee {
	
	@Id    
    @GeneratedValue(generator = "id")
	@Type(type=("EmployeeService"))
	@Column(name = "id")
	private Integer id;	
	@Column(name = "name")
	private String name;
	@Column(name = "father_name")
	private String father_name;
	@Column(name = "age")
	private Integer age;

}
