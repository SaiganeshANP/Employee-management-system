package com.Employeemanagement.Service;

import java.util.List;

import com.Employeemanagement.Model.Employee;

public interface EmployeeService {
  public   Employee createEmployee(Employee employee);
   public List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    Employee updateEmployee(Long id, Employee employee);
    void deleteEmployee(Long id);
}