package com.example.company.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.company.entity.FoodCompany;
import com.example.company.repository.FoodCompanyRepository;
import com.example.company.repository.ProductRepository;

@Service
public class FoodCompanyService {
    @Autowired
    private FoodCompanyRepository foodCompanyRepository;
    @Autowired
    private ProductRepository productRepository;
    
    public String save(FoodCompany food){
        foodCompanyRepository.saveAndFlush(food);
        return "ok";
    }
    public FoodCompany save(List<FoodCompany> obj1){
        List<FoodCompany>obj2=new ArrayList<>();
        FoodCompany obj3=null;
        for(FoodCompany obj4:obj1){
            obj3=new FoodCompany();
            foodCompanyRepository.saveAndFlush(obj4);
        }
        return obj3;

    }
    public List<FoodCompany> getAll() {
        return foodCompanyRepository.findAll();
    }

    public Optional<FoodCompany> getById(int id) {
        return foodCompanyRepository.findById(id);

    }

    public String update(FoodCompany country) {
    	foodCompanyRepository.saveAndFlush(country);
        return "update";
    }

    public void delete(int id) {
    	foodCompanyRepository.deleteById(id);

    }
}