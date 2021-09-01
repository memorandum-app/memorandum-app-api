package com.memorandum.domain.repository;

import com.memorandum.domain.model.ArticleBasicInfoModel;

public interface ArticleRepository {
    public ArticleBasicInfoModel getArticleBasicInfoByArticleId(Integer articleId);
}
