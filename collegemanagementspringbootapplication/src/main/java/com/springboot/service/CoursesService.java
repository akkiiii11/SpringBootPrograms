package com.springboot.service;

import com.springboot.entity.Courses;

public interface CoursesService
{
	// save teacher details in db table
		Courses addCourses(Courses courses);
		
		// method to fetch teacher detail based on tid from db table
		Courses getCoursesDetail(int cid);
		
		//method to modify teacher detail based on tid from db table
		Courses updateCoursesDetail(Courses courses, int cid);
		
		//method to remove teacher detail based on tid from db table
		void deleteCoursesDetail(int cid);
}