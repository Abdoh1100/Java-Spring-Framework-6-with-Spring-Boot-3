package org.example.config;

import org.example.app.Alien;
import org.example.app.Computer;
import org.example.app.Desktop;
import org.example.app.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("org.example")
public class appConfig {


//    @Bean
//    Computer desk(){
//
//        return new Desktop();
//    }
//    @Bean
//    Alien ai(Computer computer){   //(@Autowired Computer computer--- @Qualifier("lap") Computer computer
//        Alien obj=new Alien();
//        obj.setAge(21);
//        obj.setComp(computer);
//        return obj;
//
//    }
//    @Bean
//    @Primary
//    public Laptop lap(){
//      return new Laptop();
//    }
}
