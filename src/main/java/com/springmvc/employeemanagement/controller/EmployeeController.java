package com.springmvc.employeemanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="employees")
public class EmployeeController {

	@GetMapping(value="/all")
	private String getEmployees(Model model) {
		
		try {
			
		}catch(Exception e) {
			return "error";
		}
		return "employees";
	}
}
