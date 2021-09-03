package com.learn.restEmployee.dao;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.restEmployee.model.Department;

@Configuration
public class DepartmentDao {
	
	private static ArrayList<Department> DEPARTMENT_LIST;
	
	public DepartmentDao() {
		ApplicationContext context= new ClassPathXmlApplicationContext("department.xml");
		DEPARTMENT_LIST= context.getBean("deptList", java.util.ArrayList.class);
		
	}
	
	public ArrayList<Department> getAllDepartment(){
		return DEPARTMENT_LIST;
	}

}
