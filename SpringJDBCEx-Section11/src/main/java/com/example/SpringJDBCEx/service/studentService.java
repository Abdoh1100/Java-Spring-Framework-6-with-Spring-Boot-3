package com.example.SpringJDBCEx.service;

import com.example.SpringJDBCEx.model.student;
import com.example.SpringJDBCEx.repo.studentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentService {

    private studentRepo repo;


    public void addStudent(student st){
       repo.save(st);
    }

    public studentRepo getRepo() {
        return repo;
    }
    @Autowired
    public void setRepo(studentRepo repo) {
        this.repo = repo;
    }

    public List<student> getStudents() {
        return repo.findAll();
    }
}
