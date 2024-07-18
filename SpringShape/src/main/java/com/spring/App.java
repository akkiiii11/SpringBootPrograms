package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
//        Painter paint = (Painter) context.getBean("Ajay");
//        paint.perform();
        
//    	Performer perform = (Performer) context.getBean("Vijay");
//    	perform.perform();
    	
    	Performer perform = (Performer) context.getBean("Ajay");
    	perform.perform();
        

    }
}
