package com.memorandum.presentation.controller;

import com.memorandum.application.service.ArticleSetService;
import com.memorandum.domain.model.ArticleSetModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("article")
public class ArticleSetController {

    @Autowired
    ArticleSetService articleSetService;

    @GetMapping("articleId")
    public ArticleSetModel getArticleSetById(@RequestParam("articleId") Integer articleId) {
        return articleSetService.getArticleSetById(articleId);
    }
}
