package com.dailycodebuffer.service;

import java.util.List;
import java.util.Objects;

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

	@Override
	public List<Department> fetDepartmentList() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}

	@Override
	public Department fetDepartmentById(Long depatmentid) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(depatmentid).get();
		
	}

	@Override
	public void deleteDepartmentById(Long depatmentid) {
		departmentRepository.deleteById(depatmentid);
		
		
	}

	@Override
	public Department updateByID(Long departmentid, Department department) {
		// TODO Auto-generated method stub
		Department db= departmentRepository.findById(departmentid).get();
		if(Objects.nonNull(department.getDepartmentname())&&
				!"".equalsIgnoreCase(department.getDepartmentname())) {
			db.setDepartmentname(department.getDepartmentname());
			
		}
		if(Objects.nonNull(department.getDepartmentcode())&&
				!"".equalsIgnoreCase(department.getDepartmentcode())) {
			db.setDepartmentcode(department.getDepartmentcode());
			
		}
		
		if(Objects.nonNull(department.getDepartmentaddress())&&
				!"".equalsIgnoreCase(department.getDepartmentaddress())) {
			db.setDepartmentaddress(department.getDepartmentaddress());
			
		}
		
			
		return departmentRepository.save(db);
	}

	@Override
	public Department fetchDepartmentByName(String departmentname) {
		// TODO Auto-generated method stub
		return departmentRepository.findByDepartmentname(departmentname);
	}

	/*
	 * @Override public Department fetchDepartmentByOrder(String departmentname) {
	 * // TODO Auto-generated method stub return
	 * departmentRepository.findByDepartmentnameOrderBYDepartmentaddressAsc(
	 * departmentname); }
	 */



}
