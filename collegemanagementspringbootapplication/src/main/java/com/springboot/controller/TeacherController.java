package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.springboot.dto.TeacherDTO;
import com.springboot.entity.Teacher;
import com.springboot.service.TeacherService;
//import com.springboot.util.TeacherConverter;

import jakarta.validation.Valid;

@RestController 	//@Controller + @RequestBody
public class TeacherController 
{
	@Autowired
	TeacherService tservice;
	
//	@Autowired
//	TeacherConverter tconvert;
	//come from postman data 
	//ResponseEntity(we use another server thats why we use ResponseEntity) is a returntype of saveTeacher
	//http://localhost:8080/Teacher/addTeacher
	@PostMapping("/Teacher/addTeacher")
	public ResponseEntity<Teacher> saveTeacher(@Valid @RequestBody Teacher teacher)
	{
		return new ResponseEntity<Teacher>(tservice.addTeacher(teacher),HttpStatus.CREATED);
		
	}
	
//	@PostMapping("/Teacher/addTeacher")
//	public ResponseEntity<TeacherDTO> saveTeacher(@Valid @RequestBody TeacherDTO tdo)
//	{
//		Teacher teacher = tconvert.convertTeacherDTOTeacher(tdo);
//		return new ResponseEntity<TeacherDTO>(tservice.addTeacher(teacher),HttpStatus.CREATED);
//		
//	}
	
	//@PathVariable : bind to URI template variable
	//http://localhost:8080/Teacher/get(1)
	@GetMapping("/Teacher/get/{tid}")
	public ResponseEntity<Teacher> getTeacher(@PathVariable ("tid") int tid)
	{
		return new ResponseEntity<Teacher>(tservice.getTeacherDetail(tid),HttpStatus.OK);
	}
	
	// delete
	@DeleteMapping("/Teacher/remove/{tid}")
	public ResponseEntity<String> deleteTeacher(@PathVariable ("tid") int tid)
	{
		tservice.deleteTeacherDetail(tid);
		return new ResponseEntity<String>("Deleted Sucessfully", HttpStatus.OK);
	}
	
	//update
	//@RequestBody : Student object call to JSON file
	@PutMapping("/update/{tid}")
    public ResponseEntity<String> updateTeacher(@RequestBody Teacher teacher,@PathVariable("tid") int tid) {
		tservice.updateTeacherDetail(teacher,tid); // Delegate to service layer
        return new ResponseEntity<String>("Updated Successfully", HttpStatus.OK);
    }
	
	@GetMapping("/Teacher/getTPhone/{tphone}")
	public ResponseEntity<Teacher> getTeacherPhone(@PathVariable("tphone") long tphone)
	{
		
		return new ResponseEntity<Teacher>(tservice.getTeacherByPhone(tphone),HttpStatus.CREATED);
		
	}
	
	@GetMapping("/Teacher/getTDesignation/{designation}")
	public List<Teacher> getTeacherDesignation(@PathVariable("designation") String designation)
	{
		
		return tservice.getTeacherdesignation(designation);
		
	}
	
	@GetMapping("/Teacher/getTName/{tname}")
	public List<Teacher> getTeacherByName(@PathVariable("tname") String tname)
	{	
		
		return tservice.getTeacherByName(tname);
		
	}
	
}
