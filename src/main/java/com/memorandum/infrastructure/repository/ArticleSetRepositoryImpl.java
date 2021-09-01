package com.memorandum.infrastructure.repository;

import com.memorandum.domain.model.ArticleSetModel;
import com.memorandum.domain.repository.ArticleSetRepository;
import com.memorandum.infrastructure.database.mapper.custom.ArticleSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ArticleSetRepositoryImpl implements ArticleSetRepository {

    @Autowired
    private ArticleSetMapper articleSetMapper;

    @Override
    public ArticleSetModel getArticleSetById(Integer id) {
        return new ArticleSetModel(articleSetMapper.selectByPrimaryKey(id));
    }
}
