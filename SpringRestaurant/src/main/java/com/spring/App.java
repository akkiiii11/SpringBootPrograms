package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        Restaurant rest = (Restaurant) context.getBean("restBean");
        rest.greetCustomer();
        rest.prepareDrink();
        
    }
}
