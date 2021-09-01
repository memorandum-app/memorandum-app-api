package com.memorandum.domain.repository;

import com.memorandum.domain.model.ArticleModel;
import com.memorandum.infrastructure.database.record.custom.Article;

public interface ArticleRepository {
    public ArticleModel getArticleById(Integer id);
}
