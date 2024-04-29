package com.charan.spring_mvc;

import com.charan.spring_mvc.model.Alien;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home()
    {
        return "index";
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

//    @RequestMapping("/add")
//    public String add(@RequestParam("num1") int i ,@RequestParam("num2") int j, HttpSession session)
//    {
//        int num3=i+j;
//        session.setAttribute("num3",num3);
//        return "result.jsp";
//    }

//    @RequestMapping("/add")
//    public ModelAndView add(@RequestParam("num1") int i ,@RequestParam("num2") int j, HttpSession session)
//    {
//        ModelAndView mv= new ModelAndView();
//        int num3=i+j;
//        mv.setViewName("result");
//        mv.addObject("num3",num3);
//        return mv;
//    }
//
//    @RequestMapping("/add")
//    public String add(@RequestParam("num1") int i ,@RequestParam("num2") int j, Model m)
//    {
//
//        int num3=i+j;
//
//        m.addAttribute("num3",num3);
//        return "result";
//    }

    @RequestMapping("/add")
    public String add(@RequestParam("num1") int i ,@RequestParam("num2") int j, ModelMap m)
    {

        int num3=i+j;

        m.addAttribute("num3",num3);
        return "result";
    }

    @RequestMapping("addAlien")
    public String addAlien(@RequestParam("aid") int aid, @RequestParam("name") String name, Model model)
    {
        Alien a= new Alien();
        a.setAid(aid);
        a.setName(name);

        model.addAttribute("alien",a.toString());
        return "result";
    }
}
