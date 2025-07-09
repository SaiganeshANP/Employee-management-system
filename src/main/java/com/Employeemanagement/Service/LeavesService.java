package com.Employeemanagement.Service;

import java.util.List;

import com.Employeemanagement.Model.Leaves;

public interface LeavesService {
    Leaves applyLeave(Leaves leave);
    List<Leaves> getAllLeaves();
    List<Leaves> getLeavesByEmployeeId(Long empId);
}

