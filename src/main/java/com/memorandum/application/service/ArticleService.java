package com.memorandum.application.service;

import com.memorandum.domain.model.ArticleBasicInfoModel;
import com.memorandum.domain.model.ArticleSetModel;
import com.memorandum.domain.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleSetRepository;

    public ArticleSetModel getArticleSetById(Integer Id) {
        return  articleSetRepository.getArticleSetById(Id);
    }

    public List<ArticleBasicInfoModel> getArticleList(String language) { return articleSetRepository.getArticleList(language); }
}
