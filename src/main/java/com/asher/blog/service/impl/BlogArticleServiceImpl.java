package com.asher.blog.service.impl;

import com.asher.blog.entity.BlogArticle;

import com.asher.blog.entity.BlogArticleAll;
import com.asher.blog.entity.BlogArticleExample;
import com.asher.blog.mapper.BlogArticleMapper;
import com.asher.blog.service.BlogArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author alance
 */
@Service
public class BlogArticleServiceImpl implements BlogArticleService {

    @Autowired
    private BlogArticleMapper blogArticleMapper;


    @Override
    public int countByExample(BlogArticleExample example) {
        return blogArticleMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(BlogArticleExample example) {
        return blogArticleMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String artId) {
        return blogArticleMapper.deleteByPrimaryKey(artId);
    }

    @Override
    public int insert(BlogArticle record) {
        return blogArticleMapper.insert(record);
    }

    @Override
    public int insertSelective(BlogArticle record) {
        return blogArticleMapper.insertSelective(record);
    }

    @Override
    public List<BlogArticle> selectByExample(BlogArticleExample example) {
        PageHelper.startPage(1, 5);
        return blogArticleMapper.selectByExample(example);
    }

    @Override
    public PageInfo<BlogArticleAll> selectByExampleForPage(BlogArticleExample example,Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<BlogArticleAll> list = blogArticleMapper.selectByExampleHasNickName(example);
        return new PageInfo<>(list);

    }

    @Override
    public BlogArticle selectByPrimaryKey(String artId) {
        return blogArticleMapper.selectByPrimaryKey(artId);
    }

    @Override
    public int updateByExampleSelective(BlogArticle record, BlogArticleExample example) {
        return blogArticleMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(BlogArticle record, BlogArticleExample example) {
        return blogArticleMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(BlogArticle record) {
        return blogArticleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BlogArticle record) {
        return blogArticleMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<BlogArticleAll> selectBycarousel(Integer length) {
        BlogArticleExample example = new BlogArticleExample();
        example.setOrderByClause("CREATE_TIME DESC");
        PageHelper.startPage(1, length);
        List<BlogArticleAll> list = blogArticleMapper.selectByExampleHasNickName(example);
        return new PageInfo<>(list);
    }

}
