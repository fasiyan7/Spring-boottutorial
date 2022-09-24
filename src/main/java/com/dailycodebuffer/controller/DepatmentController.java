package com.dailycodebuffer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.entity.Department;
import com.dailycodebuffer.service.DepartmentService;

@RestController
public class DepatmentController {
@Autowired
	  private DepartmentService departmentservice;
	  @PostMapping("/departments")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentservice.saveDepartment(department);
		
	}
}
