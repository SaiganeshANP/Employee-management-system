package com.Employeemanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Employeemanagement.Model.Leaves;

public interface LeavesRepository extends JpaRepository<Leaves, Long> {

	Leaves save(Leaves leave);
	
}