package com.anusha.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.anusha.entity.Department;
@Repository
public interface DepartmentDao {
	
	public Department getbyid(int deptid);

	public List<Department> getalldepartments();

	public Department saveDepartment(Department dept);
}
