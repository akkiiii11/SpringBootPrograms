package com.springboot.exception;

public class CoursesIdNotFoundException extends RuntimeException
{
	public CoursesIdNotFoundException(String message)
	{
		super(message);
		
	}
}