package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Employee;
import com.springboot.serviceimplementation.EmployeeServiceImpl;

/*

postman will send the request through http protocol
http protocol method
http can handle request using getMap.
getMApping - retrive data
post() - (is a method) - postMapping - insert data
putMapping - update data
deleteMapping - delete data

*/

@RestController			//accept the request
public class EmployeeController {
	
	//http://localhost:8080/addEmp
	
	@Autowired
	EmployeeServiceImpl service;
	
	@PostMapping("/addEmp")
	public Employee empAdd(@RequestBody Employee emp)
	{
		return service.addEmployee(emp);
	}

}
