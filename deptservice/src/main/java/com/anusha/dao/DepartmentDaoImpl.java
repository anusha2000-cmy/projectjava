package com.anusha.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anusha.entity.Department;
import com.anusha.repository.DepartmentRepository;

@Repository
public class DepartmentDaoImpl implements DepartmentDao{
	@Autowired
	private DepartmentRepository dr;

	@Override
	public Department saveDepartment(Department dept) {
		dr.save(dept);
		return dept;
	}
	@Override
	public Department getbyid(int deptid) {
		Department dept=dr.findById(deptid).get();
		return dept;
	}
	@Override
	public List<Department> getalldepartments() {
		List<Department> dlist=dr.findAll();
		return dlist;
	}

}
