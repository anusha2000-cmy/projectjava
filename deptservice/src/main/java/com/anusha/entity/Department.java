package com.anusha.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="dept")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Department {

	@Id
	private int deptid;
	private String deptname;
	private String location;
	
}


