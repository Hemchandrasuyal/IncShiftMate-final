package com.starapp.incshift.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starapp.incshift.entity.Employee;
import com.starapp.incshift.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public Employee loginEmployee(int Employeeid, String Password) {
		// TODO Auto-generated method stub
		return employeeRepository.findByemployeeIdAndPAssword(Employeeid ,Password);
	}




}
