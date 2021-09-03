package com.learn.restEmployee.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.restEmployee.dao.EmployeeDao;
import com.learn.restEmployee.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;
	
	public ArrayList<Employee> getAllEmployee(){
		return employeeDao.getAllEmployee();
	}

}
