package com.springboot.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.springboot.dto.TeacherDTO;
import com.springboot.entity.Teacher;
import com.springboot.exception.TeacherIdNotFoundException;
import com.springboot.repository.TeacherRepository;
import com.springboot.service.TeacherService;
//import com.springboot.util.TeacherConverter;

@Service			
public class TeacherServiceImpl implements TeacherService 
{

	@Autowired
	TeacherRepository teacherRepo;
	
//	@Autowired
//	TeacherConverter tcover;
//	
//	@Override
//	public TeacherDTO addTeacher(Teacher teacher) {
//		
//		return tcover.convertTeacherToTeacherDTO(teacher);
//	}
	
	@Override
	public Teacher addTeacher(Teacher teacher) {
		
		return teacherRepo.save(teacher);
	}

	@Override
	public Teacher getTeacherDetail(int tid) {
		
		return teacherRepo.findById(tid).
				orElseThrow(()-> new TeacherIdNotFoundException("Teacher id is not corrected"));
	}

	@Override
	public Teacher updateTeacherDetail(Teacher teacher, int tid) {
		Teacher UpdateTeacher = teacherRepo.findById(tid).
				orElseThrow(()-> new TeacherIdNotFoundException("Teacher id is not corrected"));
				// set new value
				UpdateTeacher.setTphone(teacher.getTphone());
				UpdateTeacher.setDesignation(teacher.getDesignation());
				teacherRepo.save(UpdateTeacher);
		return UpdateTeacher;
	}

	@Override
	public void deleteTeacherDetail(int tid) 
	{
		Teacher delTeacher =teacherRepo.findById(tid).
		orElseThrow(()-> new TeacherIdNotFoundException("Teacher id is not corrected"));
		teacherRepo.delete(delTeacher);
		
		/* or
		 * teacherRepo.findById(tid).
		orElseThrow(()-> new TeacherIdNotFoundException("Teacher id is not corrected"));
		teacherRepo.deleteById(tid);*/
	}

	@Override
	public Teacher getTeacherByPhone(long tphone) {
		
		return teacherRepo.findTeacherByPhone(tphone);
	}

	@Override
	public List<Teacher> getTeacherdesignation(String designation) {
		
		return teacherRepo.findTeacherDesignation(designation);
	}

	@Override
	public List<Teacher> getTeacherByName(String name) 
	{		
		return teacherRepo.findTeacherByName(name);
	}

}