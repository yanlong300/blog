package com.asher.blog.mapper;

import com.asher.blog.entity.BlogTag;
import com.asher.blog.entity.BlogTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author alance
 */
@Repository
public interface BlogTagMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_tag
     *
     * @mbggenerated
     */
    int countByExample(BlogTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_tag
     *
     * @mbggenerated
     */
    int deleteByExample(BlogTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_tag
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String tagId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_tag
     *
     * @mbggenerated
     */
    int insert(BlogTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_tag
     *
     * @mbggenerated
     */
    int insertSelective(BlogTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_tag
     *
     * @mbggenerated
     */
    List<BlogTag> selectByExample(BlogTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_tag
     *
     * @mbggenerated
     */
    BlogTag selectByPrimaryKey(String tagId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_tag
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BlogTag record, @Param("example") BlogTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_tag
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") BlogTag record, @Param("example") BlogTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_tag
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BlogTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_tag
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BlogTag record);
}