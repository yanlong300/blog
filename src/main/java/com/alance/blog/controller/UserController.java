package com.alance.blog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登录控制器
 * @author yanlong  2018年04月26日13:48:44
 */
@Slf4j
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/register")
    public String register(String email,String password,String confirmPassword ){
        log.info("用户{}注册 {} {}",email,password,confirmPassword);


        return "redirect:/";
    }

}
