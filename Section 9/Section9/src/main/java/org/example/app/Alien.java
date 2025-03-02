package org.example.app;

public class Alien {

    int age;
    Computer comp;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }
    public void code(){
        comp.compile();
    }
}
