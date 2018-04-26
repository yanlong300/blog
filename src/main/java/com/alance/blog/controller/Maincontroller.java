package com.alance.blog.controller;

import com.alance.blog.entity.BlogArticleAll;
import com.alance.blog.entity.BlogArticleExample;
import com.alance.blog.service.BlogArticleService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 主控制器
 *
 * @author yanlong
 * @date 2017年12月15日
 */
@Controller
public class Maincontroller {

    @Autowired
    private BlogArticleService blogArticleService;

    //public static final String[] images = {"b1", "b2", "b3", "b3"};

    /**
     * 首页展示
     * @param page 页码
     * @return index.html
     */
    @RequestMapping("/")
    public String index(String page, Model model) {
        //首页轮播图
        PageInfo<BlogArticleAll> carouseList = blogArticleService.selectBycarousel(5);
        model.addAttribute("carouseList", carouseList.getList());
        //正文文章
        BlogArticleExample example = new BlogArticleExample();
        example.setOrderByClause("CREATE_TIME DESC");
        PageInfo<BlogArticleAll> list = blogArticleService.selectByExampleForPage(example, Integer.parseInt(page == null ? "1" : page), 10);
        model.addAttribute("list", list.getList());
        return "index";
    }

    /**
     * 关于我页面
     * @return aboutme/aboutme.html
     */
    @RequestMapping("/aboutme")
    public String aboutme(Model model) {
        model.addAttribute("name", "Dear");
        return "aboutme";
    }

    /**
     * 留言板
     * @return message/message.html
     */
    @RequestMapping("/message")
    public String message(Model model) {
        model.addAttribute("name", "Dear");
        return "message";
    }

    @RequestMapping("/timeline")
    public String timeline(Model model) {
        model.addAttribute("name", "Dear");
        return "timeline";
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
