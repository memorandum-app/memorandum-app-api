package com.memorandum.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ArticleSetForm {
    private Integer articleId;
    private String articleTitle;
    private String authorId;
    private String authorName;
    private String language;
    private String category;
    private LocalDate createdDate;
    private LocalDate updateDate;
    List<ArticleSetOneModel> articleContentList = new ArrayList<>();

    public ArticleSetForm(ArticleSetModel articleSetModel) {
        this.articleId = articleSetModel.getArticleId();
        this.articleTitle = articleSetModel.getArticleTitle();
        this.authorId = articleSetModel.getAuthorId();
        this.authorName = articleSetModel.getAuthorName();
        this.language = articleSetModel.getLanguage();
        this.category = articleSetModel.getCategory();
        this.createdDate = articleSetModel.getCreatedDate();
        this.updateDate = articleSetModel.getUpdateDate();
        for (ArticleSetOneModel articleOneModelItem : articleSetModel.getArticleContentList()) {
            if(articleOneModelItem.getStyle() != null && articleOneModelItem.getContent() != null) {
                this.articleContentList.add(articleOneModelItem);
            }
        }
    }
}
