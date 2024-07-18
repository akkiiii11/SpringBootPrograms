package com.springboot.service;

import com.springboot.entity.Employee;

public interface EmployeeService {
	
	public Employee addEmployee(Employee emp);
	public Employee getEmployee(int id);
	public String deleteEmployee();
	public Employee updateEmployee(int id);

}
