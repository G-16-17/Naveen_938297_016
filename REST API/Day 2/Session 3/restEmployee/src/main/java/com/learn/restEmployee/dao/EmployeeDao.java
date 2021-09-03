package com.learn.restEmployee.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.restEmployee.model.Employee;

@Configuration
public class EmployeeDao {

	
	private static ArrayList<Employee> EMPLOYEE_LIST;
	
	public EmployeeDao() {
		ApplicationContext context=new ClassPathXmlApplicationContext("employee.xml");
		EMPLOYEE_LIST=context.getBean("empList",java.util.ArrayList.class);
	}
	
	public ArrayList<Employee> getAllEmployee(){
		return EMPLOYEE_LIST;
	}
}
