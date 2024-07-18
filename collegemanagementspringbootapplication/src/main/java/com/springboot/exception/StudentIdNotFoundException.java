package com.springboot.exception;

public class StudentIdNotFoundException extends RuntimeException
{
	public StudentIdNotFoundException(String message)
	{
		super(message);
		
	}
}