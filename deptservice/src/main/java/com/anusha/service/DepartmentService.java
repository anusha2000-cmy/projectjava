package com.anusha.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.anusha.entity.Department;

@Service
public interface DepartmentService {
	
	public Department getservice(int deptid);

	public List<Department> getallservice();

	void addDepartment(Department dept);
}
