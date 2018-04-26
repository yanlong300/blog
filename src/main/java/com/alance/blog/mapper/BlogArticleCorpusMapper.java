package com.alance.blog.mapper;

import com.alance.blog.entity.BlogArticleCorpus;
import com.alance.blog.entity.BlogArticleCorpusExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author alance
 */
@Repository
public interface BlogArticleCorpusMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_article_corpus
     *
     * @mbggenerated
     */
    int countByExample(BlogArticleCorpusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_article_corpus
     *
     * @mbggenerated
     */
    int deleteByExample(BlogArticleCorpusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_article_corpus
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String corId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_article_corpus
     *
     * @mbggenerated
     */
    int insert(BlogArticleCorpus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_article_corpus
     *
     * @mbggenerated
     */
    int insertSelective(BlogArticleCorpus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_article_corpus
     *
     * @mbggenerated
     */
    List<BlogArticleCorpus> selectByExample(BlogArticleCorpusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_article_corpus
     *
     * @mbggenerated
     */
    BlogArticleCorpus selectByPrimaryKey(String corId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_article_corpus
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BlogArticleCorpus record, @Param("example") BlogArticleCorpusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_article_corpus
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") BlogArticleCorpus record, @Param("example") BlogArticleCorpusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_article_corpus
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BlogArticleCorpus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_article_corpus
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BlogArticleCorpus record);
}