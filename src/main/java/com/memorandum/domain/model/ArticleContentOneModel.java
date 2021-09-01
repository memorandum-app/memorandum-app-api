package com.memorandum.domain.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class ArticleContentOneModel {
    private String style;
    private String content;
    private String option;

    public ArticleContentOneModel(String style, String content, String option) {
        this.style = style;
        this.content = content;
        this.option = option;
    }
}
