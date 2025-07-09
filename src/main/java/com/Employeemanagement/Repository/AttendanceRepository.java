package com.Employeemanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Employeemanagement.Model.Attendance;


	
	public interface AttendanceRepository extends JpaRepository<Attendance, Long> {

		Attendance save(Attendance attendance);
		
		
		}


