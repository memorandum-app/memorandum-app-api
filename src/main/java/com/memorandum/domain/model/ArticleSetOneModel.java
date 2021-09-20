package com.memorandum.domain.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArticleSetOneModel {
    private String style;
    private String content;
    private String option;

    public ArticleSetOneModel(String style, String content, String option) {
        this.style = style;
        this.content = content;
        this.option = option;
    }
    @Override
    public String toString() {
        if( style == null) {
            return null;
        } else {
            return style;
        }
    }
}
