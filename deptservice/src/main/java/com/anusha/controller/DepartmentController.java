package com.anusha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anusha.entity.Department;
import com.anusha.service.DepartmentService;


@RestController
@RequestMapping("department")
public class DepartmentController {

	@Autowired
	private DepartmentService ds;
	@PostMapping("/add")
	public Department addDepartment(@RequestBody Department dept) {
		ds.addDepartment(dept);
		return dept;
	}
	
	@GetMapping(value="/getbyid/{deptid}",produces="application/json")
	public Department getDept(@PathVariable int deptid) {
		Department d=ds.getservice(deptid);
		System.out.println(d);
		return d;
	}
	
	@GetMapping("/getall")
	public List<Department> getall() {
		List<Department> dlist=ds.getallservice();
		return dlist;
	}
	
}
