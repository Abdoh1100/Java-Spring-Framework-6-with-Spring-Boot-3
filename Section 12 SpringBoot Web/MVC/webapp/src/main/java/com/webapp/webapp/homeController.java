package com.webapp.webapp;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class homeController {


    @RequestMapping("/")
    public String home(){

        return "addition.jsp";
    }
// servlet way of getting submitted vars
//    @RequestMapping("add")
//    public String add(HttpServletRequest req, HttpSession session){
//        int num1=Integer.parseInt(req.getParameter("num1"));
//        int num2=Integer.parseInt(req.getParameter("num2"));
//        int output=num1+num2;
//        session.setAttribute("result",output);
//        System.out.println(output);
//        //we are returning the result page as we did the operation and we need to show it
//        return "result.jsp";
//    }

//    Spring way
    @RequestMapping("add")
    public String add(@RequestParam("num1") int num, int num2, Model model){
        // vars are already provided in the url add
//        and behind the scene spring uses sevlets :)
//requestparam is used to match the sent var from the form or the client to your var
//        to apply the function ont it
//        we have add the model so that we built our MVC model
        int output=num+num2;
        model.addAttribute("result",output);
        System.out.println(output);
        //we are returning the result page as we did the operation and we need to show it
        return "result.jsp";
    }


}
