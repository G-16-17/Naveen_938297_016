package com.learn.restEmployee.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.restEmployee.dao.DepartmentDao;
import com.learn.restEmployee.model.Department;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentDao departmentDao;
	
	public ArrayList<Department> getAllDepartment(){
		return departmentDao.getAllDepartment();
	}

}
