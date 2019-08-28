package com.springmvc.employeemanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.employeemanagement.model.Employee;
import com.springmvc.employeemanagement.repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired 
	EmployeeRepo employeeRepo;
	
	//get all employees
	public List<Employee> get() throws Exception{
		List<Employee> employee = null;
		try {
			employee = employeeRepo.findAll();
			
			return employee;
		}catch(Exception e) {
			throw new Exception("Failed to get employees");
		}
	}
	
	//get a employee
	public Optional<Employee> get(String employeeId) throws Exception{
		Optional<Employee> employee = null;
		try {
			employee = employeeRepo.findById(Long.parseLong(employeeId));
			
			return employee;
		}catch(Exception e) {
			throw new Exception("Failed to get employees");
		}
	}
}
