package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*

IOC container(dependency Injection)(Two ways: 1.constuctor way 2.setter way) 

interface BeanFactory
{
	
}

interface ApplicationCantext extends BeanFactory
{
	
}

class ClassPathXmlApplicationContext implements ApplicationCantext
{
	
}
*/

public class App
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("shape.xml");

//    	Painter paint = (Painter) context.getBean("sunny");
//    	paint.perform();

    	Performer perform = (Performer) context.getBean("sunny");
    	perform.perform();

    }
}
