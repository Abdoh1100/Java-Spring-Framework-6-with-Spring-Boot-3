package org.example;

import org.example.app.Alien;
import org.example.config.appConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {


        ApplicationContext context=new AnnotationConfigApplicationContext(appConfig.class);

        Alien obj =context.getBean(Alien.class);
        System.out.println(obj.getAge());
        obj.code();

    }
}