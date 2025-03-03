package org.example.app;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("desktop")
@Primary
@Scope("prototype")
public class Desktop implements Computer{
    @Override
    public void compile() {
        System.out.println("Desktop compiling ...");
    }
}
