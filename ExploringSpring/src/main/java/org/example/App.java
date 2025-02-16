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
               pro.age=pro.age+1;//1
        System.out.println(pro.age);
        programmer pro2=(programmer) context.getBean("programmer");
        System.out.println(pro2.age);//0 thus we have got two objects created for us
    }
}