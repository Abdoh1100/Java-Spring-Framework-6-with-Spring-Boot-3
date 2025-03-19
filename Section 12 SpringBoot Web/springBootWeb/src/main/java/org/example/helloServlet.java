package org.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class helloServlet extends HttpServlet {


    //NOte: !! methods names matter !! so it must be service.
    public void service(HttpServletRequest req, HttpServletResponse res){
        // gets executed whenever you send a request
        System.out.println("in service ... ");
    }

}
