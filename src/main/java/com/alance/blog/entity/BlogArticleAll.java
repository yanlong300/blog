package com.alance.blog.entity;

/**
 * 文章全部信息
 */
public class BlogArticleAll extends  BlogArticle{
    /**
     * 作者名称
     */
    private String nickName;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
