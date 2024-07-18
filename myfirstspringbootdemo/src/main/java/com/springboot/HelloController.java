package com.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
client			server
				application
				controller=HelloController
*/

//@Controller
@RestController     			//it is basically controller. It is combination of @Controller + @RequestBody
public class HelloController {

	@RequestMapping("/hello")
	public String helloWorld()			//end points www.amzon.com
	{
		return "Hello Spring Boot";
//		System.out.println("Hello Spring Boot");
	}

	public String goodByWorld()
	{
		return "By Spring Boot";
	}

}
