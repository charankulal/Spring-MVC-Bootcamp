package com.charan.spring_mvc;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home()
    {
        return "index.jsp";
    }

//    @RequestMapping("/add")
//    public String add(HttpServletRequest request){
//        int i= Integer.parseInt(request.getParameter("num1"));
//        int j= Integer.parseInt(request.getParameter("num2"));
//        int num3=i+j;
//        HttpSession session= request.getSession();
//        session.setAttribute("num3",num3);
//
//        return "result.jsp";
//    }

    @RequestMapping("/add")
    public String add(@RequestParam("num1") int i ,@RequestParam("num2") int j, HttpSession session)
    {
        int num3=i+j;
        session.setAttribute("num3",num3);
        return "result.jsp";
    }
}
