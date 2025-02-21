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
//        programmer pro=(programmer) context.getBean("programmer");
//        programmer pro =context.getBean("programmer", programmer.class);// no need for type casting now !

        programmer pro =(programmer)context.getBean( "programmer");// no need for neither type casting nor name now !
        System.out.println(pro.getAge());
        pro.getComp().compile();

//        computer com=context.getBean(computer.class);
    }
}