package com.memorandum.domain.repository;

import com.memorandum.domain.model.ArticleBasicInfoModel;
import com.memorandum.domain.model.ArticleListGetModel;
import com.memorandum.domain.model.ArticleSetForm;
import com.memorandum.domain.model.ArticleSetModel;

import java.util.List;

public interface ArticleRepository {
    public ArticleSetForm getArticleSetById(Integer id);
    public List<ArticleBasicInfoModel> getArticleListByAuthorLanguage(ArticleListGetModel articleListGetModel);
    public List<ArticleBasicInfoModel> getArticleListByLanguage(String articleListGetModel);
    public List<ArticleBasicInfoModel> getArticleListByAuthor(String articleListGetModel);
    public List<ArticleBasicInfoModel> getArticleListByNull();
}
