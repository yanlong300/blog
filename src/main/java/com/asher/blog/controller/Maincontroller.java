package com.asher.blog.controller;

import com.asher.blog.pojo.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

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
    public String hello(Model model) {
        model.addAttribute("name", "Dear");
        return "hello";
    }
    @RequestMapping("/index")
    public String index(Model model) {
        List<Article> articleList = new ArrayList<Article>();
        Article a1 = new Article();
        a1.setId("0000001");
        a1.setAuthor("asher");
        a1.setImageUrl("images/"+images[new Random().nextInt(3)]+".jpg");
        a1.setTitle("冷静的思考");
        a1.setDigest("在慌忙中冷静的思考");
        a1.setContent("总是在慌忙中思考");
        a1.setCreateTime(new Date());
        Article a2 = new Article();
        a2.setId("0000002");
        a2.setAuthor("asher");
        a2.setImageUrl("images/"+images[new Random().nextInt(3)]+".jpg");
        a2.setTitle("狂热的行动");
        a2.setDigest("在狂热中疯狂的行动");
        a2.setContent("总是在狂热中疯狂的行动");
        a2.setCreateTime(new Date());
        Article a3 = new Article();
        a3.setId("0000002");
        a3.setAuthor("asher");
        a3.setImageUrl("images/"+images[new Random().nextInt(3)]+".jpg");
        a3.setTitle("清醒思考的艺术");
        a3.setDigest("教会人们。如何防骗防忽悠");
        a3.setContent("xxxxxxxxxxxx");
        a3.setCreateTime(new Date());
        articleList.add(a1);
        articleList.add(a2);
        articleList.add(a3);
        articleList.add(a1);
        articleList.add(a2);
        articleList.add(a3);
        model.addAttribute("articleList", articleList);
        model.addAttribute("name", "Dear");
        model.addAttribute("length", "102");
        return "index";
    }

    @RequestMapping("/main")
    public String main(Model model) {
        model.addAttribute("name", "Dear");
        return "main";
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
