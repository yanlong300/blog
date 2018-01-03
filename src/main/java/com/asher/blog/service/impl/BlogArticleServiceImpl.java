package com.asher.blog.service.impl;

import com.asher.blog.entity.BlogArticle;

import com.asher.blog.mapper.BlogArticleMapper;
import com.asher.blog.service.BlogArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogArticleServiceImpl implements BlogArticleService {

    @Autowired
    private BlogArticleMapper blogArticleMapper;


    @Override
    public BlogArticle selectByPrimaryKey(String artId) {
        return blogArticleMapper.selectByPrimaryKey(artId);
    }
}
