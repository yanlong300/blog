package com.asher.blog.service;

import com.asher.blog.entity.BlogArticleContent;
import com.asher.blog.entity.BlogArticleContentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BlogArticleContentService {

    int countByExample(BlogArticleContentExample example);

    int deleteByExample(BlogArticleContentExample example);

    int deleteByPrimaryKey(String artId);

    int insert(BlogArticleContent record);

    int insertSelective(BlogArticleContent record);

    List<BlogArticleContent> selectByExampleWithBLOBs(BlogArticleContentExample example);

    List<BlogArticleContent> selectByExample(BlogArticleContentExample example);

    BlogArticleContent selectByPrimaryKey(String artId);

    int updateByExampleSelective(@Param("record") BlogArticleContent record, @Param("example") BlogArticleContentExample example);

    int updateByExampleWithBLOBs(@Param("record") BlogArticleContent record, @Param("example") BlogArticleContentExample example);

    int updateByExample(@Param("record") BlogArticleContent record, @Param("example") BlogArticleContentExample example);

    int updateByPrimaryKeySelective(BlogArticleContent record);

    int updateByPrimaryKeyWithBLOBs(BlogArticleContent record);
}
