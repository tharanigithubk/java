package com.example.company.entity;

import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="food_company")
public class FoodCompany {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int foodcompanyId;
	
	@Column(name="name")
	private String companyName;
	
	@Column(name="founder")
	private String companyfounder;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="food_companyId")
	private List<Product>product;
	
	
}
