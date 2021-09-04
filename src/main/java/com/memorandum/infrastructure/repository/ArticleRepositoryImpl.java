package com.memorandum.infrastructure.repository;

import com.memorandum.domain.model.ArticleBasicInfoModel;
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
    public List<ArticleBasicInfoModel> getArticleList(String language) {
        SelectStatementProvider selectStatement = SqlBuilder.select(ArticleBasicInfoDynamicSqlSupport.articleId, ArticleBasicInfoDynamicSqlSupport.articleTitle, ArticleBasicInfoDynamicSqlSupport.authorId, ArticleBasicInfoDynamicSqlSupport.authorName, ArticleBasicInfoDynamicSqlSupport.language, ArticleBasicInfoDynamicSqlSupport.category, ArticleBasicInfoDynamicSqlSupport.createdDate, ArticleBasicInfoDynamicSqlSupport.updateDate)
                .from(ArticleBasicInfoDynamicSqlSupport.articleBasicInfo)
                .where(ArticleBasicInfoDynamicSqlSupport.language, isEqualTo(language))
                .build()
                .render(RenderingStrategy.MYBATIS3);

        List<ArticleBasicInfo> record = articleBasicInfoMapper.selectMany(selectStatement);
        List<ArticleBasicInfoModel> articleBasicInfoList = new ArrayList<>();
        for(ArticleBasicInfo recordItem : record) {
            articleBasicInfoList.add(new ArticleBasicInfoModel(recordItem));
        }
        return articleBasicInfoList;
    }
}