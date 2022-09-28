package com.dailycodebuffer.service;

import java.util.List;

import com.dailycodebuffer.entity.Department;

public interface DepartmentService {

	public Department saveDepartment(Department department);
	public List<Department> fetDepartmentList();

	public Department fetDepartmentById(Long depatmentid);

	 public void deleteDepartmentById(Long depatmentid);

	public Department updateByID(Long departmentid, Department department);

	public Department fetchDepartmentByName(String departmentname);


}
