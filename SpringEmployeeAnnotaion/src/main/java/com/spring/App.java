package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("employeecfg.xml");
        Employee emp = (Employee) context.getBean("Anjali");
        emp.work();
    }
}
