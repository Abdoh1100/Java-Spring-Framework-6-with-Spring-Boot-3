package org.example;

public class questionsService {

    question [] questions=new question[5];

    public void displayQuestions(){
        for(question a:questions){
            System.out.print(a.toString());
        }
        
    }
}
