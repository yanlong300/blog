package com.asher.blog.controller;

import com.asher.blog.entity.BlogArticle;
import com.asher.blog.entity.BlogArticleAll;
import com.asher.blog.entity.BlogArticleContent;
import com.asher.blog.entity.BlogArticleExample;
import com.asher.blog.service.BlogArticleContentService;
import com.asher.blog.service.BlogArticleService;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 文章控制器
 * @author yanlong
 */
@Controller
@RequestMapping("/art")
public class ArticleController {

    private static final Logger logger = org.apache.log4j.Logger.getLogger(ArticleController.class);

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
        BlogArticle art = blogArticleService.selectByPrimaryKey(id);
        BlogArticleContent artCon = blogArticleContentService.selectByPrimaryKey(id);
        model.addAttribute("art",art);
        model.addAttribute("artCon",artCon);
        return "article";
    }

}
