package com.dailycodebuffer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.Repository.DepartmentRepository;
import com.dailycodebuffer.entity.Department;

@Service
public class DepartmentServiceImpl  implements DepartmentService{
   @Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

}
