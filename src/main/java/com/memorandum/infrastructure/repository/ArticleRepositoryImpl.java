package com.memorandum.infrastructure.repository;

import com.memorandum.domain.model.ArticleModel;
import com.memorandum.domain.repository.ArticleRepository;
import com.memorandum.infrastructure.database.mapper.custom.ArticleMapper;
import com.memorandum.infrastructure.database.record.custom.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ArticleRepositoryImpl implements ArticleRepository {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public ArticleModel getArticleById(Integer id) {
        return new ArticleModel(articleMapper.selectByPrimaryKey(id));
    }
}
