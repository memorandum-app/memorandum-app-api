package com.memorandum.application.service;

import com.memorandum.domain.model.ArticleBasicInfoModel;
import com.memorandum.domain.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public ArticleBasicInfoModel getArticleBasicInfoByArticleId(Integer articleId) {
        return articleRepository.getArticleBasicInfoByArticleId(articleId);
    }

}
