package org.example.app;

public class Laptop implements Computer{
    @Override
    public void compile() {
        System.out.println("Laptop compiling ...");
    }
}
