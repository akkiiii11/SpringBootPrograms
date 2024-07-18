//package com.springboot.util;
//
//import org.springframework.beans.BeanUtils;
//import org.springframework.stereotype.Component;
//
//import com.springboot.dto.TeacherDTO;
//import com.springboot.entity.Teacher;
////this class will be responsible to convert from DTO to entity and vice versa
//
////instead of teacher entity we are using teacher dto(data transfer object)
//@Component
//public class TeacherConverter {
//
//	public Teacher convertTeacherDTOTeacher(TeacherDTO tdto)
//	{
//		Teacher tc = new Teacher();
//		
//		if(tdto != null)
//		{
//			BeanUtils.copyProperties(tdto, tc);
//		}
//		
//		return tc;
//		
//	}
//	
//	public TeacherDTO convertTeacherToTeacherDTO(Teacher teacher)
//	{
//		TeacherDTO tdto = new TeacherDTO();
//		
//		if(teacher != null)
//		{
//			BeanUtils.copyProperties(teacher, tdto);
//		}
//		
//		return tdto;
//		
//	}
//}
