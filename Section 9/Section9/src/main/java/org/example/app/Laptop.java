package org.example.app;

import org.springframework.stereotype.Component;

@Component("lap")
public class Laptop implements Computer{
    @Override
    public void compile() {
        System.out.println("Laptop compiling ...");
    }
}
