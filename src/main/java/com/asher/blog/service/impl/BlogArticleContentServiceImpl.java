package com.asher.blog.service.impl;

import com.asher.blog.entity.BlogArticleContent;
import com.asher.blog.entity.BlogArticleContentExample;
import com.asher.blog.mapper.BlogArticleContentMapper;
import com.asher.blog.service.BlogArticleContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yanlong
 */
@Service
public class BlogArticleContentServiceImpl implements BlogArticleContentService {

    @Autowired
    private BlogArticleContentMapper blogArticleContentMapper;

    @Override
    public int countByExample(BlogArticleContentExample example) {
        return blogArticleContentMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(BlogArticleContentExample example) {
        return blogArticleContentMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String artId) {
        return blogArticleContentMapper.deleteByPrimaryKey(artId);
    }

    @Override
    public int insert(BlogArticleContent record) {
        return blogArticleContentMapper.insert(record);
    }

    @Override
    public int insertSelective(BlogArticleContent record) {
        return blogArticleContentMapper.insertSelective(record);
    }

    @Override
    public List<BlogArticleContent> selectByExampleWithBLOBs(BlogArticleContentExample example) {
        return blogArticleContentMapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public List<BlogArticleContent> selectByExample(BlogArticleContentExample example) {
        return blogArticleContentMapper.selectByExample(example);
    }

    @Override
    public BlogArticleContent selectByPrimaryKey(String artId) {
        return blogArticleContentMapper.selectByPrimaryKey(artId);
    }

    @Override
    public int updateByExampleSelective(BlogArticleContent record, BlogArticleContentExample example) {
        return blogArticleContentMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExampleWithBLOBs(BlogArticleContent record, BlogArticleContentExample example) {
        return blogArticleContentMapper.updateByExampleWithBLOBs(record, example);
    }

    @Override
    public int updateByExample(BlogArticleContent record, BlogArticleContentExample example) {
        return blogArticleContentMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(BlogArticleContent record) {
        return blogArticleContentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(BlogArticleContent record) {
        return blogArticleContentMapper.updateByPrimaryKeyWithBLOBs(record);
    }
}
