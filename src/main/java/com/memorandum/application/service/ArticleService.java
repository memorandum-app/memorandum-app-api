package com.memorandum.application.service;

import com.memorandum.domain.model.ArticleBasicInfoModel;
import com.memorandum.domain.model.ArticleListGetModel;
import com.memorandum.domain.model.ArticleSetModel;
import com.memorandum.domain.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleSetRepository;

    public ArticleSetModel getArticleSetById(Integer Id) {
        return  articleSetRepository.getArticleSetById(Id);
    }

    public List<ArticleBasicInfoModel> getArticleList(ArticleListGetModel articleListGetModel) {
        if(articleListGetModel.getAuthorId() != null && articleListGetModel.getLanguage() != null) {
            return articleSetRepository.getArticleListByAuthorLanguage(articleListGetModel);
        } else if(articleListGetModel.getLanguage() != null ) {
            return articleSetRepository.getArticleListByLanguage(articleListGetModel.getLanguage());
        } else if(articleListGetModel.getAuthorId() != null ) {
            return articleSetRepository.getArticleListByAuthor(articleListGetModel.getAuthorId());
        } else {
            System.out.println("Null");
        }
        return null;
    }
}
