package com.springboot.exception;

public class BatchesIdNotFoundException extends RuntimeException
{
	public BatchesIdNotFoundException(String message)
	{
		super(message);
		
	}
}