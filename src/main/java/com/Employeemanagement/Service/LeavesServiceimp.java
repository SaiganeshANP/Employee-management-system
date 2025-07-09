package com.Employeemanagement.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employeemanagement.Model.Leaves;
import com.Employeemanagement.Repository.LeavesRepository;


@Service
public class LeavesServiceimp implements LeavesService {

    @Autowired
    private LeavesRepository leaveRepository;

    @Override
    public Leaves applyLeave(Leaves leave) {
        leave.setStatus("Pending");
        return leaveRepository.save(leave);
    }

    @Override
    public List<Leaves> getAllLeaves() {
        return leaveRepository.findAll();
    }

    @Override
    public List<Leaves> getLeavesByEmployeeId(Long empId) {
        return leaveRepository.findAll()
            .stream()
            .filter(l -> l.getEmployee().getId().equals(empId))
            .collect(Collectors.toList());
    }
}
