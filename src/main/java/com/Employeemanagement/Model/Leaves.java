package com.Employeemanagement.Model;

import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Leaves {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    private Long id;
    private LocalDate startDate;
    private LocalDate endDate;
    private String leaveType;
    private String leavestatus;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

	public void setStatus(String status2) {
	
		
	}

    
}
