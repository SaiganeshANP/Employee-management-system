package com.Employeemanagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Employeemanagement.Model.Leaves;
import com.Employeemanagement.Service.LeavesService;


@RestController
@RequestMapping("/api/leaves")
public class LeavesController {

    @Autowired
    private LeavesService leaveService;

    @PostMapping("/addLeave")
    public Leaves applyLeave(@RequestBody Leaves leave) {
        return leaveService.applyLeave(leave);
    }

    @GetMapping
    public List<Leaves> getAllLeaves() {
        return leaveService.getAllLeaves();
    }

    @GetMapping("/employee/{empId}")
    public List<Leaves> getLeavesByEmployee(@PathVariable Long empId) {
        return leaveService.getLeavesByEmployeeId(empId);
    }
}
