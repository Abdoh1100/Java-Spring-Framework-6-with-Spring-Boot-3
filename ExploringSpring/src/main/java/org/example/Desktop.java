package org.example;

public class Desktop implements computer {

    public Desktop(){
        System.out.println("Desktop object is created !");
    }
    @Override
    public void compile() {
        System.out.println("Compiling... Desktop");
    }
}
