package com.memorandum.application.service;


import com.memorandum.domain.model.ArticleContentModel;
import com.memorandum.domain.repository.ArticleContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleContentService {

    @Autowired
    private ArticleContentRepository articleContentRepository;

    public ArticleContentModel getArticleContentByContentId(Integer contentId) {
        return articleContentRepository.getArticleContentByContentId(contentId);

    }
}
