package com.stackroute.controller;

import com.stackroute.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    User user=new User("Santhosh");
    public String user(ModelMap map){
    map.addAttribute("greeting",user.getUser());
    return "index";
}

}
