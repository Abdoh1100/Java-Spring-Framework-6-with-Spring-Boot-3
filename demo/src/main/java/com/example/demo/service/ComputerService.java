package com.example.demo.service;

import com.example.demo.model.Computer;
import com.example.demo.repo.computerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComputerService {


    private computerRepository repo;

    public void addComputer(Computer com){
      repo.save(com);
    }

    public computerRepository getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(computerRepository repo) {
        this.repo = repo;
    }

    public boolean isGoodForProg(){
        return true;
    }
}
