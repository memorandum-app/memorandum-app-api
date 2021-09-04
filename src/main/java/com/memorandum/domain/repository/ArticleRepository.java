package com.memorandum.domain.repository;

import com.memorandum.domain.model.ArticleBasicInfoModel;
import com.memorandum.domain.model.ArticleSetModel;

import java.util.List;

public interface ArticleRepository {
    public ArticleSetModel getArticleSetById(Integer id);
    public List<ArticleBasicInfoModel> getArticleList(String language);
}
