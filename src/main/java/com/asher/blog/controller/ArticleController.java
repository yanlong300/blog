package com.asher.blog.controller;

import com.asher.blog.entity.BlogArticle;
import com.asher.blog.service.BlogArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 文章控制器
 * @author yanlong
 */
@Controller
@RequestMapping("/art")
public class ArticleController {

    @Autowired
    private BlogArticleService blogArticleService;

    @RequestMapping("/summary/{id}")
    @ResponseBody
    public String ArticleSummary(@PathVariable String id){
        //20161006230324032010005
        BlogArticle art = blogArticleService.selectByPrimaryKey(id);
        return art.toString();
    }

    @RequestMapping("/content/{id}")
    @ResponseBody
    public String ArticleContent(@PathVariable String id){
        //20161006230324032010005
        BlogArticle art = blogArticleService.selectByPrimaryKey(id);
        return art.toString();
    }


}
