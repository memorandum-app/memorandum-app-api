package com.memorandum.infrastructure.repository;

import com.memorandum.domain.model.ArticleBasicInfoModel;
import com.memorandum.domain.model.ArticleListGetModel;
import com.memorandum.domain.model.ArticleSetModel;
import com.memorandum.domain.repository.ArticleRepository;
import com.memorandum.infrastructure.database.mapper.ArticleBasicInfoDynamicSqlSupport;
import com.memorandum.infrastructure.database.mapper.ArticleBasicInfoMapper;
import com.memorandum.infrastructure.database.mapper.custom.ArticleSetMapper;
import com.memorandum.infrastructure.database.record.ArticleBasicInfo;
import com.mysql.cj.xdevapi.SelectStatement;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.MyBatis3RenderingStrategy;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Repository
public class ArticleRepositoryImpl implements ArticleRepository {

    @Autowired
    private ArticleBasicInfoMapper articleBasicInfoMapper;

    @Autowired
    private ArticleSetMapper articleSetMapper;

    @Override
    public ArticleSetModel getArticleSetById(Integer id) {
        return new ArticleSetModel(articleSetMapper.selectByPrimaryKey(id));
    }

    @Override
    public List<ArticleBasicInfoModel> getArticleListByAuthorLanguage(ArticleListGetModel articleListGetModel) {
        SelectStatementProvider selectStatement = SqlBuilder.select(ArticleBasicInfoDynamicSqlSupport.articleId, ArticleBasicInfoDynamicSqlSupport.articleTitle, ArticleBasicInfoDynamicSqlSupport.authorId, ArticleBasicInfoDynamicSqlSupport.authorName, ArticleBasicInfoDynamicSqlSupport.language, ArticleBasicInfoDynamicSqlSupport.category, ArticleBasicInfoDynamicSqlSupport.createdDate, ArticleBasicInfoDynamicSqlSupport.updateDate)
                .from(ArticleBasicInfoDynamicSqlSupport.articleBasicInfo)
                .where(ArticleBasicInfoDynamicSqlSupport.language, isEqualTo(articleListGetModel.getLanguage()))
                .and(ArticleBasicInfoDynamicSqlSupport.authorId, isEqualTo(articleListGetModel.getAuthorId()))
                .build()
                .render(RenderingStrategy.MYBATIS3);

        List<ArticleBasicInfo> result = articleBasicInfoMapper.selectMany(selectStatement);
        List<ArticleBasicInfoModel> articleBasicList = new ArrayList<>();
        for(ArticleBasicInfo resultItem : result) {
            articleBasicList.add(new ArticleBasicInfoModel(resultItem));
        }
        return articleBasicList;
    }

    @Override
    public List<ArticleBasicInfoModel> getArticleListByLanguage(String Language) {
        SelectStatementProvider selectLanguageStatement = SqlBuilder.select(ArticleBasicInfoDynamicSqlSupport.articleId, ArticleBasicInfoDynamicSqlSupport.articleTitle, ArticleBasicInfoDynamicSqlSupport.authorId, ArticleBasicInfoDynamicSqlSupport.authorName, ArticleBasicInfoDynamicSqlSupport.language, ArticleBasicInfoDynamicSqlSupport.category, ArticleBasicInfoDynamicSqlSupport.createdDate, ArticleBasicInfoDynamicSqlSupport.updateDate)
                .from(ArticleBasicInfoDynamicSqlSupport.articleBasicInfo)
                .where(ArticleBasicInfoDynamicSqlSupport.language, isEqualTo(Language))
                .build()
                .render(RenderingStrategy.MYBATIS3);

        List<ArticleBasicInfo> result = articleBasicInfoMapper.selectMany(selectLanguageStatement);
        List<ArticleBasicInfoModel> articleLanguageList = new ArrayList<>();
        for(ArticleBasicInfo resultItem : result) {
            articleLanguageList.add(new ArticleBasicInfoModel(resultItem));
        }
        return articleLanguageList;
    }

    @Override
    public List<ArticleBasicInfoModel> getArticleListByAuthor(String AuthorId) {
        SelectStatementProvider selectAuthorStatement = SqlBuilder.select(ArticleBasicInfoDynamicSqlSupport.articleId, ArticleBasicInfoDynamicSqlSupport.articleTitle, ArticleBasicInfoDynamicSqlSupport.authorId, ArticleBasicInfoDynamicSqlSupport.authorName, ArticleBasicInfoDynamicSqlSupport.language, ArticleBasicInfoDynamicSqlSupport.category, ArticleBasicInfoDynamicSqlSupport.createdDate, ArticleBasicInfoDynamicSqlSupport.updateDate)
                .from(ArticleBasicInfoDynamicSqlSupport.articleBasicInfo)
                .where(ArticleBasicInfoDynamicSqlSupport.authorId, isEqualTo(AuthorId))
                .build()
                .render(RenderingStrategy.MYBATIS3);

        List<ArticleBasicInfo> result = articleBasicInfoMapper.selectMany(selectAuthorStatement);
        List<ArticleBasicInfoModel> articleAuthorList = new ArrayList<>();
        for(ArticleBasicInfo resultItem : result) {
            articleAuthorList.add(new ArticleBasicInfoModel(resultItem));
        }
        return articleAuthorList;
    }

    @Override
    public List<ArticleBasicInfoModel> getArticleListByNull() {
        SelectStatementProvider selectNullStatement = SqlBuilder.select(ArticleBasicInfoDynamicSqlSupport.articleId, ArticleBasicInfoDynamicSqlSupport.articleTitle, ArticleBasicInfoDynamicSqlSupport.authorId, ArticleBasicInfoDynamicSqlSupport.authorName, ArticleBasicInfoDynamicSqlSupport.language, ArticleBasicInfoDynamicSqlSupport.category, ArticleBasicInfoDynamicSqlSupport.createdDate, ArticleBasicInfoDynamicSqlSupport.updateDate)
                .from(ArticleBasicInfoDynamicSqlSupport.articleBasicInfo)
                .build()
                .render(RenderingStrategy.MYBATIS3);

        List<ArticleBasicInfo> result = articleBasicInfoMapper.selectMany(selectNullStatement);
        List<ArticleBasicInfoModel> articleNullList = new ArrayList<>();
        for(ArticleBasicInfo resultItem : result) {
            articleNullList.add(new ArticleBasicInfoModel(resultItem));
        }
        return articleNullList;
    }
}
