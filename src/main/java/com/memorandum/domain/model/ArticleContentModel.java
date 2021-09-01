package com.memorandum.domain.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArticleContentModel {
    private Integer contentId;
    private String style;
    private String content;
    private String option;

    public ArticleContentModel(Integer contentId, String style, String content, String option) {
        this.contentId = contentId;
        this.style = style;
        this.content = content;
        this.option = option;
    }

}
