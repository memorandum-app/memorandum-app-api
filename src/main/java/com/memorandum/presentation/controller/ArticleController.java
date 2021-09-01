package com.memorandum.presentation.controller;

import com.memorandum.application.service.ArticleService;
import com.memorandum.domain.model.ArticleModel;
import com.memorandum.infrastructure.database.record.custom.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("")
    public ArticleModel GetArticleById(@RequestParam("articleId") Integer articleId) {
        return articleService.getArticleById(articleId);
    }
}
