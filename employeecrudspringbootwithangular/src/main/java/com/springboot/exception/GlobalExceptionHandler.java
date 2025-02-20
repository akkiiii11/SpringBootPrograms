package com.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler
{
	@ExceptionHandler(EmployeeIdNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleTeacherException(EmployeeIdNotFoundException tx, WebRequest request )
	{
		ErrorMessage er = new ErrorMessage(HttpStatus.NOT_FOUND, tx.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(er);
		
	}
}