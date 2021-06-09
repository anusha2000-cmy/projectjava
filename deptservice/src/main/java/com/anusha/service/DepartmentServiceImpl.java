package com.anusha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anusha.dao.DepartmentDao;
import com.anusha.entity.Department;
@Service
public class DepartmentServiceImpl implements DepartmentService{
	@Autowired
	private DepartmentDao dao;
	@Override
	public void addDepartment(Department dept) {
		dao.saveDepartment(dept);
	}
	@Override
	public Department getservice(int deptid) {
		return dao.getbyid(deptid);
	}
	@Override
	public List<Department> getallservice() {
		return dao.getalldepartments();
	}
	
}
