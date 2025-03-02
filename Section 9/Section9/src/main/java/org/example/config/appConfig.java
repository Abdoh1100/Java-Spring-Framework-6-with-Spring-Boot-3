package org.example.config;

import org.example.app.Alien;
import org.example.app.Computer;
import org.example.app.Desktop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class appConfig {


    @Bean
    Computer desk(){

        return new Desktop();
    }
    @Bean
    Alien ai(@Autowired Computer computer){
        Alien obj=new Alien ();
        obj.setAge(21);
        obj.setComp(computer);
        return obj;

    }
}
