package com.asher.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {


    @RequestMapping("/login")
    public String login(Model model) {
        model.addAttribute("name", "Dear");
        return "user/login";
    }

    @RequestMapping("/regist")
    public String regist(Model model) {
        model.addAttribute("name", "Dear");
        return "user/regist";
    }
}
