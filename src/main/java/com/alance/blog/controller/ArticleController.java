package com.alance.blog.controller;

import com.alance.blog.entity.BlogArticle;
import com.alance.blog.entity.BlogArticleContent;
import com.alance.blog.service.BlogArticleContentService;
import com.alance.blog.service.BlogArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 文章控制器
 * @author yanlong
 */
@Controller
@RequestMapping("/art")
@Slf4j
public class ArticleController {

    @Autowired
    private BlogArticleService blogArticleService;
    @Autowired
    private BlogArticleContentService blogArticleContentService;

    /**
     * 依据id查询文章
     * @param id 文章id
     * @return 文章详情
     */
    @RequestMapping("/{id}")
    public String ArticleContent(@PathVariable String id,Model model){
        log.info("依据ID查询文章：id {}",id);
        BlogArticle art = blogArticleService.selectByPrimaryKey(id);
        BlogArticleContent artCon = blogArticleContentService.selectByPrimaryKey(id);
        model.addAttribute("art",art);
        model.addAttribute("artCon",artCon);
        return "article";
    }

}
