package org.springwebapp.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {

    @RequestMapping("/")
    public String home(){

        System.out.println("in method home ");

        return "index.jsp";
    }
}
