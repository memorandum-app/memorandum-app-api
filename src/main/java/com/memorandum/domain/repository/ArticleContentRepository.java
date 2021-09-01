package com.memorandum.domain.repository;

import com.memorandum.domain.model.ArticleContentModel;

public interface ArticleContentRepository {
    public ArticleContentModel getArticleContentByContentId(Integer contentId);
}
