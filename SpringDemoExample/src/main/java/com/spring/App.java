package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("shape.xml");
    	
//    	Painter paint = (Painter) context.getBean("shape");
//    	paint.perform();
    	
//    	Performer perform = (Performer) context.getBean("shape");
//    	perform.perform();
    	
    	Cricketer cricket = (Cricketer) context.getBean("mahi");
    	cricket.score();
    }
}
