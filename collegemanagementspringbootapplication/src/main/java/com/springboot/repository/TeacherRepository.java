package com.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.entity.Teacher;


public interface TeacherRepository extends JpaRepository<Teacher, Integer>
{
	@Query("select t from Teacher where t.tname=?1")
	List<Teacher> findTeacherByName(String tname);
	
	@Query("select t from Teacher where t.tphone=?1 ")
	Teacher findTeacherByPhone(long tphone);
	
	@Query("select t from Teacher t where t.designation like ?1% order by tname")
	List<Teacher> findTeacherDesignation(String designation);
}


//JpaRepository - store the common crud operations.