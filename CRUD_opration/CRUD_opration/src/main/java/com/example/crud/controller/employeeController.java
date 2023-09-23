package com.example.crud.controller;
import  java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.model.employee;
import com.example.crud.repository.employeeRepository;



@RestController
@RequestMapping("/api/v1/")
public class employeeController {
	
	@Autowired
	 private employeeRepository employeeRepository;
	
 @GetMapping("/employee")
	public List<employee>getAllEmployees(){
		return employeeRepository.findAll();
		
	}
	

}
