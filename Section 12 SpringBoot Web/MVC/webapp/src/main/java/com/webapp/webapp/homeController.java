package com.webapp.webapp;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeController {


    @RequestMapping("/")
    public String home(){

        return "addition";
    }
    @RequestMapping("/add-Alien")
    public String addAlien(){
        return "addAlien";
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
//    @RequestMapping("add")
//    public String add(@RequestParam("num1") int num, int num2, Model model){
//        // vars are already provided in the url add
////        and behind the scene spring uses sevlets :)
////requestparam is used to match the sent var from the form or the client to your var
////        to apply the function ont it
////        we have add the model so that we built our MVC model
//        int output=num+num2;
//        model.addAttribute("result",output);
//        System.out.println(output);
//        //we are returning the result page as we did the operation and we need to show it
//        return "result";
//    }
    @RequestMapping("add")
    public ModelAndView add(int num1,int num2,ModelAndView mv){
// you can set the data and the view name as well using model and view object
        int output=num1+num2;
        mv.addObject("result",output);
        mv.setViewName("result");
        return mv;
    }

//    @RequestMapping("addAlien")
//    public ModelAndView addAlien(@RequestParam("aId") int aId,String aName,ModelAndView mv){
//        System.out.println("in");
//        Alien newAlien=new Alien(aId,aName);
//        mv.addObject("alien",newAlien);
//        mv.setViewName("addAlienResult");
//        return mv;
//
//    }

    // we can do better using ModelAttribute annotation
    // we can receive only one object that contains all the info for us
    //instead of accepting many params!!
    //spring who will create this obj for us.
    // note : you can only pass the alien object without adding ModelAttribute annotation
    // it works to so it is optional you jus use it when you have a name which is not
    // the lowercase version of the class name !! so Alien alien is ok but not nAlien ?
    //in  that case you have to use ModelAttribute to give the name of the object
    @RequestMapping("addAlien")
    public String addAlien(@ModelAttribute("newAlien") Alien newAlien){
        return "addAlienResult";

    }
//you can use the ModelAttribute also to give a value to the view and to be able to use it
//    in the JSP file as a variable.
    @ModelAttribute("course")
    public String courseName(){
        return "Jave";
    }


}
