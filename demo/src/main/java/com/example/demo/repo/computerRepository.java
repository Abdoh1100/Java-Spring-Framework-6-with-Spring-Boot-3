package com.example.demo.repo;

import com.example.demo.model.Computer;
import org.springframework.stereotype.Repository;

@Repository
public class computerRepository {

    // in this class you can have all the crud operations here
    public void save(Computer com){
        System.out.println("Saved in DB!!");
    }
}
