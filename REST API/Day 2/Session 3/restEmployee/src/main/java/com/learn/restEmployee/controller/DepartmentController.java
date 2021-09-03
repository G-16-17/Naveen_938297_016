package com.learn.restEmployee.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.restEmployee.model.Department;
import com.learn.restEmployee.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/departments")
	public ArrayList<Department> getAllDepartment(){
		return departmentService.getAllDepartment();
	}

}
