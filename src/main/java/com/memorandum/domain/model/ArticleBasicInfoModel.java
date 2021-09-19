package com.memorandum.domain.model;

import com.memorandum.infrastructure.database.record.ArticleBasicInfo;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class ArticleBasicInfoModel {

    private Integer articleId;

    private String articleTitle;

    private String authorId;

    private String authorName;

    private String language;

    private String category;

    private LocalDate createdDate;

    private LocalDate updateDate;

    public ArticleBasicInfoModel(ArticleBasicInfo articleBasicInfo) {
        this.articleId = articleBasicInfo.getArticleId();
        this.articleTitle = articleBasicInfo.getArticleTitle();
        this.authorId = articleBasicInfo.getAuthorId();
        this.authorName = articleBasicInfo.getAuthorName();
        this.language = articleBasicInfo.getLanguage();
        this.category = articleBasicInfo.getCategory();
        this.createdDate = articleBasicInfo.getCreatedDate();
        this.updateDate = articleBasicInfo.getUpdateDate();
    }
}
