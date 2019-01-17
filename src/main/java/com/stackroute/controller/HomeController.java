package com.stackroute.controller;

import com.stackroute.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String greeting(ModelMap map){
        User user=new User("santhosh");
        map.addAttribute("greeting",user.getUser());
        return "index";
    }
    @RequestMapping(value = "/user")
    public String user(ModelMap map){
        User user=new User("User");
        map.addAttribute("greeting",user.getUser());
        return "index";
    }
}
