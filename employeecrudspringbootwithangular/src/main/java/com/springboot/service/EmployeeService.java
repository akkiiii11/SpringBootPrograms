package com.springboot.service;

import java.util.List;

import com.springboot.entity.Employee;

public interface EmployeeService {
	
	Employee addEmployee(Employee employee);
	
	Employee getEmployeeById(long employeeId);
	
	Employee updateEmployee(Employee employee, long employeeId);
	
	void deleteEmployee(long employeeId);
	
	List<Employee> getAllEmployee();

}
