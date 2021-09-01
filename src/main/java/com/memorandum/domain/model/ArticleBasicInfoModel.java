package com.memorandum.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

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

    public ArticleBasicInfoModel(Integer articleId, String articleTitle, String authorId, String authorName, String language, String category, LocalDate createdDate, LocalDate updateDate) {
        this.articleId = articleId;
        this.articleTitle = articleTitle;
        this.authorId = authorId;
        this.authorName = authorName;
        this.language = language;
        this.category = category;
        this.createdDate = createdDate;
        this.updateDate = updateDate;
    }
}
