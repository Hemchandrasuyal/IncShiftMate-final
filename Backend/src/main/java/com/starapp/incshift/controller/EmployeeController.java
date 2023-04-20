package com.starapp.incshift.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.starapp.incshift.dto.EmployeeLogin;
import com.starapp.incshift.entity.Employee;
import com.starapp.incshift.repository.EmployeeRepository;
import com.starapp.incshift.services.EmployeeService;



@RestController
@RequestMapping("/java")
public class EmployeeController {
	
	@Autowired
    EmployeeService employeeService;

	//LOGIN 
	@CrossOrigin("*")	
    @PostMapping("/login")
    public ResponseEntity<Employee> Login(@RequestBody EmployeeLogin employeeLogin){
		
return ResponseEntity.ok(employeeService.loginEmployee(employeeLogin.getEmployeeId(),employeeLogin.getPassword()));
    }
	

}