package com.springboot.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Courses;
import com.springboot.entity.Student;
import com.springboot.exception.CoursesIdNotFoundException;
import com.springboot.exception.StudentIdNotFoundException;
import com.springboot.exception.TeacherIdNotFoundException;
import com.springboot.repository.CoursesRepository;
import com.springboot.service.CoursesService;


@Service
public class CoursesServiceImpl implements CoursesService
{

	@Autowired
	CoursesRepository coRepo;
	
	@Override
	public Courses addCourses(Courses courses) {
		return coRepo.save(courses);
	}

	@Override
	public Courses getCoursesDetail(int cid) {
		return coRepo.findById(cid).
				orElseThrow(()-> new CoursesIdNotFoundException("Course id is not corrected"));
	}

	@Override
	public Courses updateCoursesDetail(Courses courses, int cid) {

		Courses UpdateCourses = coRepo.findById(cid).
				orElseThrow(()-> new CoursesIdNotFoundException("Student id is not corrected"));
				// set new value
		//Student.setSphone(student.getSphone());
		UpdateCourses.setCourseName(courses.getCourseName());
		UpdateCourses.setDuration(courses.getDuration());
		coRepo.save(UpdateCourses);
		return UpdateCourses;
	}

	@Override
	public void deleteCoursesDetail(int cid) {
		Courses delCourses =coRepo.findById(cid).
				orElseThrow(()-> new CoursesIdNotFoundException("Student id is not corrected"));
		coRepo.delete(delCourses);
	}

}
