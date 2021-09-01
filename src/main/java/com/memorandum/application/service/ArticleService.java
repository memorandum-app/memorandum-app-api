package com.memorandum.application.service;

import com.memorandum.domain.model.ArticleModel;
import com.memorandum.domain.repository.ArticleRepository;
import com.memorandum.infrastructure.database.record.custom.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public ArticleModel getArticleById(Integer id) {
        return articleRepository.getArticleById(id);
    }
}
