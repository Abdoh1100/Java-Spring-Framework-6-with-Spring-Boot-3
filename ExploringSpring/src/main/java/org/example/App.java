package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        programmer pro=(programmer) context.getBean("programmer");
        System.out.println(pro.getAge());
        pro.getComp().compile();
        
    }
}