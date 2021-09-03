package com.memorandum.domain.repository;

import com.memorandum.domain.model.ArticleSetModel;

public interface ArticleSetRepository {
    public ArticleSetModel getArticleSetById(Integer id);
}
