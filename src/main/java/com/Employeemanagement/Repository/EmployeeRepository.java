package com.Employeemanagement.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Employeemanagement.Model.Employee;





public interface EmployeeRepository extends JpaRepository<Employee,Long> {

	public List<Employee> findAll();
	
	

}
