package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("location	F:\\backend\\spring-boot\\spring\\learn\\springcore\\src\\main\\java\\com\\springcore\\springcore\\config.xml");
        Student student1 = (Student) context.getBean("student1");
        System.out.print(student1);

        
    }
}
