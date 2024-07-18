package com.springboot.service;

import com.springboot.entity.Student;

public interface StudentService
{
	// save Student details in db table
		Student addStudent(Student student);
		
		// method to fetch Student detail based on sid from db table
		Student getStudentDetail(int id);
		
		//method to modify Student detail based on sid from db table
		Student updateStudentDetail(Student student, int sid);
		
		//method to remove Student detail based on sid from db table
		void deleteStudentDetail(int sid);
}
