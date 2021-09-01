package com.memorandum.infrastructure.repository;

import com.memorandum.domain.model.ArticleContentModel;
import com.memorandum.domain.repository.ArticleContentRepository;
import com.memorandum.infrastructure.database.mapper.ArticleContentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ArticleContentRepositoryImpl implements ArticleContentRepository {

    @Autowired
    private ArticleContentMapper articleContentMapper;

    @Override
    public ArticleContentModel getArticleContentByContentId(Integer contentId) {

    }
}
