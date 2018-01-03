package com.asher.blog.controller;

import com.asher.blog.entity.BlogArticle;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * 主控制器
 * @author yanlong
 * @date 2017年12月15日
 *
 */
@Controller
public class Maincontroller {
    public static  final String[] images={"b1","b2","b3","b3"};

    @RequestMapping("/")
    @ResponseBody
    public String hello(Model model) {
        model.addAttribute("name", "Dear");
        return "hello world";
    }
    @RequestMapping("/index")
    public String index(Model model) {
        List<BlogArticle> articleList = new ArrayList<BlogArticle>();
        model.addAttribute("articleList", articleList);
        model.addAttribute("name", "Dear");
        model.addAttribute("length", "102");
        return "index";
    }


    @RequestMapping("/article")
    public String article(Model model) {
        model.addAttribute("name", "Dear");
        return "article/article";
    }


    @RequestMapping("/timeline")
    public String timeline(Model model) {
        model.addAttribute("name", "Dear");
        return "article/timeline";
    }

    @RequestMapping("/aboutme")
    public String aboutme(Model model) {
        model.addAttribute("name", "Dear");
        return "aboutme/aboutme";
    }


    @RequestMapping("/message")
    public String message(Model model) {
        model.addAttribute("name", "Dear");
        return "message/message";
    }

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
