package com.springboot.entity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Employee;
import com.springboot.repository.EmployeeRepository;
import com.springboot.service.EmployeeService;

import jakarta.validation.Valid;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/Employee")
	public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody Employee employee)
	{
		return new ResponseEntity<Employee>(employeeService.addEmployee(employee),HttpStatus.CREATED);
		
	}
	
	@GetMapping("/Employee")
	public List<Employee> getAllEmployees(){
		
		return employeeService.getAllEmployee();
	}
	
	@GetMapping("/Employee/{employeeId}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable ("employeeId") long employeeId)
	{
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeId),HttpStatus.OK);
	}
	
	
	@DeleteMapping("/Employee/{employeeId}")
	public ResponseEntity<String> deleteEmployee(@PathVariable ("employeeId") long employeeId)
	{
		employeeService.deleteEmployee(employeeId);
		return new ResponseEntity<String>("Deleted Sucessfully", HttpStatus.OK);
	}
	
	
	@PutMapping("/Employee/{employeeId}")
	public ResponseEntity<String> updateEmployee(@RequestBody Employee employee, @PathVariable("employeeId") long employeeId) {
	employeeService.updateEmployee(employee, employeeId); // Delegate to service layer
	return new ResponseEntity<String>("Updated Successfully", HttpStatus.OK);
	
	}

}
