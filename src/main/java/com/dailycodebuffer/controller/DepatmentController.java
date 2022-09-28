package com.dailycodebuffer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
@GetMapping("/departments")
	  
	  public List<Department> fetDepartmentList(){
		return   departmentservice.fetDepartmentList();
		  
	  }
	 @GetMapping("/departments/{id}")
	  public Department fetchDepartmentById(@PathVariable("id") Long depatmentid) {
		 return departmentservice.fetDepartmentById(depatmentid);
		  
	  }
	 
	 @DeleteMapping("/departments/{id}")
	 
	 public String deleteDepartmentById(@PathVariable("id") Long depatmentid)
	 {
		 
		 departmentservice.deleteDepartmentById(depatmentid);
		 return "Success";
	 }
	 
	 @PutMapping("/departments/{id}")
	 public Department updateByID(@PathVariable("id") Long departmentid,@RequestBody Department department)
	 {
		 return departmentservice.updateByID(departmentid,department);
		 
	 }
	 
	 
	 @GetMapping("/departments/name/{name}")
	 public Department fetchDepartmentByName(@PathVariable("name") String  departmentname) {
		return departmentservice.fetchDepartmentByName(departmentname);
		 
	 }
	 
		/*
		 * @GetMapping("/departments/order/{name}")
		 * 
		 * public Department fetchdeDepartmentBYOrder(@PathVariable("name") String
		 * departmentname) { return
		 * departmentservice.fetchDepartmentByOrder(departmentname); }
		 */ 
}




