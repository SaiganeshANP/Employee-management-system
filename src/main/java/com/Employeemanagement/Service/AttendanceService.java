package com.Employeemanagement.Service;

import java.util.List;

import com.Employeemanagement.Model.Attendance;

public interface AttendanceService {
    Attendance markAttendance(Attendance attendance);
    List<Attendance> getAllAttendance();
    List<Attendance> getAttendanceByEmployeeId(Long empId);
}
