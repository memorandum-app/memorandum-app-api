package com.memorandum.presentation.controller;

import com.memorandum.application.service.ArticleService;
import com.memorandum.domain.model.ArticleBasicInfoModel;
import com.memorandum.domain.model.ArticleListGetModel;
import com.memorandum.domain.model.ArticleSetModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("article")
public class ArticleController {

    @Autowired
    ArticleService articleSetService;

    @GetMapping("articleId")
    public ArticleSetModel getArticleSetById(@RequestParam("articleId") Integer articleId) {
        return articleSetService.getArticleSetById(articleId);
    }

    @GetMapping("list")
    public List<ArticleBasicInfoModel> ArticleListGetModel(@RequestBody ArticleListGetModel articleListGetModel) {
        return articleSetService.getArticleList(articleListGetModel);
    }
}