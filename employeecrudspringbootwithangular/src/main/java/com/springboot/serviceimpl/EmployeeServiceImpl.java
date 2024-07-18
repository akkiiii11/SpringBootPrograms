package com.springboot.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Employee;
import com.springboot.exception.EmployeeIdNotFoundException;
import com.springboot.repository.EmployeeRepository;
import com.springboot.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public Employee addEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(long employeeId) {
		
		return employeeRepository.findById(employeeId).
				orElseThrow(()-> new EmployeeIdNotFoundException("Employee id is not corrected"));
	}

	@Override
	public Employee updateEmployee(Employee employee, long employeeId) {
		
		Employee UpdateEmployee = employeeRepository.findById(employeeId).
				orElseThrow(()-> new EmployeeIdNotFoundException("Employee id is not corrected"));
				// set new value
		UpdateEmployee.setEmployeeEmailId(employee.getEmployeeEmailId());
				
				employeeRepository.save(UpdateEmployee);
		return UpdateEmployee;
	}

	@Override
	public void deleteEmployee(long employeeId) {
		
		Employee delEmployee = employeeRepository.findById(employeeId).
				orElseThrow(()-> new EmployeeIdNotFoundException("Employee id is not corrected"));
				employeeRepository.delete(delEmployee);
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeRepository.findAll();
	}



}
