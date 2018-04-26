package com.alance.blog.service;

import com.alance.blog.entity.BlogTag;
import com.alance.blog.entity.BlogTagExample;

import java.util.List;

/**
 * @author yanlong 2018年01月06日
 */
public interface BlogTagService {
    /**
     * 标签云展示
     * 默认10个
     * @return 标签列表
     */
    List<BlogTag> selectByTagCloud(BlogTagExample example);




}
