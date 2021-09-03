package com.learn.restEmployee.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.restEmployee.model.Employee;
import com.learn.restEmployee.service.EmployeeService;

@RestController
public class EmployeeController {
	
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employees")
	public ArrayList<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}

}
