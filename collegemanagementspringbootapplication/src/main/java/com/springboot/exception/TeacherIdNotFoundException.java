package com.springboot.exception;

public class TeacherIdNotFoundException extends RuntimeException
{
	public TeacherIdNotFoundException(String message)
	{
		super(message);
		
	}
}