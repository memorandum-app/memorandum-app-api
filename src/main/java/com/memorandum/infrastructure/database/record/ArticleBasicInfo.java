package com.memorandum.infrastructure.database.record;

import java.time.LocalDate;
import javax.annotation.Generated;

public class ArticleBasicInfo {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: article_basic_info.article_id")
    private Integer articleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: article_basic_info.article_title")
    private String articleTitle;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: article_basic_info.author_id")
    private String authorId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: article_basic_info.author_name")
    private String authorName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: article_basic_info.language")
    private String language;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: article_basic_info.category")
    private String category;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: article_basic_info.created_date")
    private LocalDate createdDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: article_basic_info.update_date")
    private LocalDate updateDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: article_basic_info.article_id")
    public Integer getArticleId() {
        return articleId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: article_basic_info.article_id")
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: article_basic_info.article_title")
    public String getArticleTitle() {
        return articleTitle;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: article_basic_info.article_title")
    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: article_basic_info.author_id")
    public String getAuthorId() {
        return authorId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: article_basic_info.author_id")
    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: article_basic_info.author_name")
    public String getAuthorName() {
        return authorName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: article_basic_info.author_name")
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: article_basic_info.language")
    public String getLanguage() {
        return language;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: article_basic_info.language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: article_basic_info.category")
    public String getCategory() {
        return category;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: article_basic_info.category")
    public void setCategory(String category) {
        this.category = category;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: article_basic_info.created_date")
    public LocalDate getCreatedDate() {
        return createdDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: article_basic_info.created_date")
    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: article_basic_info.update_date")
    public LocalDate getUpdateDate() {
        return updateDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: article_basic_info.update_date")
    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }
}