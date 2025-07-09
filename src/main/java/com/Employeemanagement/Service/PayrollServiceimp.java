package com.Employeemanagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employeemanagement.Model.Payroll;
import com.Employeemanagement.Repository.PayrollRepository;


@Service
public class PayrollServiceimp implements PayrollService {

    @Autowired
    private PayrollRepository payrollRepository;

    @Override
    public Payroll createPayroll(Payroll payroll) {
        payroll.setNetSalary(
            payroll.getSalary().add(payroll.getBonus()).subtract(payroll.getDeductions())
        );
        return payrollRepository.save(payroll);
    }

    @Override
    public List<Payroll> getAllPayrolls() {
        return payrollRepository.findAll();
    }

    @Override
    public Payroll getPayrollById(Long id) {
        return payrollRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Payroll not found"));
    }

    @Override
    public void deletePayroll(Long id) {
        payrollRepository.deleteById(id);
    }
}
