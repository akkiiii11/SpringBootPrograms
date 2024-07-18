package com.springboot.exception;

public class DepartmentIdNotFoundException extends RuntimeException
{
	public DepartmentIdNotFoundException(String message)
	{
		super(message);
		
	}
}