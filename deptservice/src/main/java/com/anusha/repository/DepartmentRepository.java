package com.anusha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anusha.entity.*;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
