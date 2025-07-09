package com.Employeemanagement.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employeemanagement.Model.Attendance;
import com.Employeemanagement.Repository.AttendanceRepository;

@Service
public class AttendanceServiceimp implements AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepository;

    @Override
    public Attendance markAttendance(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }

    @Override
    public List<Attendance> getAllAttendance() {
        return attendanceRepository.findAll();
    }

    @Override
    public List<Attendance> getAttendanceByEmployeeId(Long empId) {
        return attendanceRepository.findAll()
            .stream()
            .filter(a -> a.getEmployee().getId().equals(empId))
            .collect(Collectors.toList());
    }
}

