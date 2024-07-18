package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Courses;

public interface CoursesRepository extends JpaRepository<Courses, Integer>
{

}