package org.example;

import java.beans.ConstructorProperties;

public class programmer {

    private int age=0;
    computer comp;

    public void coding(){
        System.out.println("Coding...");
    }

//    @ConstructorProperties({"age,lap"})
//    public programmer(int age ,computer comp){
//        this.age=age;
//        this.comp=comp;
//    }
    public int getAge() {
        return age;
    }

    public computer getComp() {
        return comp;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setComp(computer comp) {
        this.comp = comp;
    }
}
