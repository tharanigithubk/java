package com.example.company.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.company.entity.FoodCompany;
import com.example.company.service.FoodCompanyService;

@RestController
public class FoodCompanyController {
    @Autowired
    private FoodCompanyService foodService;
    
    @PostMapping("/post")
    private String save(@RequestBody FoodCompany food){
        foodService.save(food);
        return "okk";
    }
    @PostMapping("/ListAll")
    private String ListAll(@RequestBody List<FoodCompany> obj1) {
        FoodCompany obj2 = foodService.save(obj1);
        return "listAll";
    }

    @GetMapping("/get")
    private List<FoodCompany> getAll() {
        return foodService.getAll();
    }

    @GetMapping("/get/{id}")
    private Optional<FoodCompany> getId(@PathVariable("id") int id) {
        return foodService.getById(id);

    }

    @PutMapping("/update")
    private String update(@RequestBody FoodCompany country) {
        foodService.update(country);
        return "update";
    }

    @DeleteMapping("/delete/{id}")
    private void deleteId(@PathVariable("id") int id) {
        foodService.delete(id);
    }

}