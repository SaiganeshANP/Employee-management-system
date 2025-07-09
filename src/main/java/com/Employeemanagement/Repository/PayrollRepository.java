package com.Employeemanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Employeemanagement.Model.Payroll;

public interface PayrollRepository extends JpaRepository<Payroll, Long> {}