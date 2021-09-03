package com.memorandum.application.service;

import com.memorandum.domain.model.ArticleSetModel;
import com.memorandum.domain.repository.ArticleSetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleSetService {

    @Autowired
    private ArticleSetRepository articleSetRepository;

    public ArticleSetModel getArticleSetById(Integer Id) {
        return  articleSetRepository.getArticleSetById(Id);
    }
}
