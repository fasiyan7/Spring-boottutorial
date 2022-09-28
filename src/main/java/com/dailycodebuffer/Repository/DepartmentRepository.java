package com.dailycodebuffer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.entity.Department;


@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	public Department findByDepartmentname(String departmentname);
}
