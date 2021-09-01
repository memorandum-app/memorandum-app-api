package com.memorandum.presentation.controller;


import com.memorandum.application.service.ArticleContentService;
import com.memorandum.domain.model.ArticleContentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("content")
public class ArticleContentController {

    @Autowired
    private ArticleContentService articleContentService;

    @GetMapping("contentId")
    public ArticleContentModel getArticleContentByContentId(@RequestParam("contentId") Integer contentId) {
        return articleContentService.getArticleContentByContentId(contentId);
    }
}
