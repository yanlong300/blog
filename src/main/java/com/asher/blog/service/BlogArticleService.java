package com.asher.blog.service;

import com.asher.blog.entity.BlogArticle;
import com.asher.blog.entity.BlogArticleAll;
import com.asher.blog.entity.BlogArticleExample;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 文章服务类
 * @author yanlong
 */
public interface BlogArticleService {

    int countByExample(BlogArticleExample example);

    int deleteByExample(BlogArticleExample example);

    int deleteByPrimaryKey(String artId);

    int insert(BlogArticle record);

    int insertSelective(BlogArticle record);

    List<BlogArticle> selectByExample(BlogArticleExample example);

    PageInfo<BlogArticleAll> selectByExampleForPage(BlogArticleExample example, Integer pageNum, Integer pageSize);

    BlogArticle selectByPrimaryKey(String artId);

    int updateByExampleSelective(@Param("record") BlogArticle record, @Param("example") BlogArticleExample example);

    int updateByExample(@Param("record") BlogArticle record, @Param("example") BlogArticleExample example);

    int updateByPrimaryKeySelective(BlogArticle record);

    int updateByPrimaryKey(BlogArticle record);

    /**
     * 查询首页轮播文章
     * 点击率最高的文章依次排序
     * @param length 轮播文章数量
     * @return 轮播文章
     */
    PageInfo<BlogArticleAll> selectBycarousel(Integer length);




}
