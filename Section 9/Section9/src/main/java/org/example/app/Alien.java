package org.example.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    // HOW YOU INJECT A VALUE ?
    @Value("30")// you can inject it through a property file to your code
    int age;

    @Autowired
    @Qualifier("lap")
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
