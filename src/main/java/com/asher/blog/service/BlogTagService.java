package com.asher.blog.service;

import com.asher.blog.entity.BlogTag;
import com.asher.blog.entity.BlogTagExample;

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
