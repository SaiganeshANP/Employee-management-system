package com.Employeemanagement.Service;

import java.util.List;

import com.Employeemanagement.Model.Payroll;

public interface PayrollService {
    Payroll createPayroll(Payroll payroll);
    List<Payroll> getAllPayrolls();
    Payroll getPayrollById(Long id);
    void deletePayroll(Long id);
}

