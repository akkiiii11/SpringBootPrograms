package com.springboot.service;

import java.util.List;

//import com.springboot.dto.TeacherDTO;
import com.springboot.entity.Teacher;

public interface TeacherService 
{
	// save teacher details in db table
	Teacher addTeacher(Teacher teacher);
//	TeacherDTO addTeacher(Teacher teacher);
	
	// method to fetch teacher detail based on tid from db table
	Teacher getTeacherDetail(int id);
	
	//method to modify teacher detail based on tid from db table
	Teacher updateTeacherDetail(Teacher teacher, int tid);
	
	//method to remove teacher detail based on tid from db table
	void deleteTeacherDetail(int tid);
	
	Teacher getTeacherByPhone(long tphone);
	
	List<Teacher> getTeacherdesignation(String designation);

	List<Teacher> getTeacherByName(String tname);
}
