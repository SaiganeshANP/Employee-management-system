package com.Employeemanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Employeemanagement.Model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {}