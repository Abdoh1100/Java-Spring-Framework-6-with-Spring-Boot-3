package com.example.SpringJDBCEx.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class student {

    private String name;
    private int ronum;
    private int marks;

    public int getRonum() {
        return ronum;
    }

    public void setRonum(int ronum) {
        this.ronum = ronum;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", ronum=" + ronum +
                ", marks=" + marks +
                '}';
    }
}
