package com.memorandum.infrastructure.repository;

import com.memorandum.domain.model.ArticleBasicInfoModel;
import com.memorandum.domain.repository.ArticleRepository;
import com.memorandum.infrastructure.database.mapper.ArticleBasicInfoDynamicSqlSupport;
import com.memorandum.infrastructure.database.mapper.ArticleBasicInfoMapper;
import com.memorandum.infrastructure.database.record.ArticleBasicInfo;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Repository
public class ArticleRepositoryImpl implements ArticleRepository {

    @Autowired
    private ArticleBasicInfoMapper articleBasicInfoMapper;

    @Override
    public ArticleBasicInfoModel getArticleBasicInfoByArticleId(Integer articleId) {
        SelectStatementProvider selectStatementArticleBasicInfo = SqlBuilder.select(
                ArticleBasicInfoDynamicSqlSupport.articleId,
                ArticleBasicInfoDynamicSqlSupport.articleTitle,
                ArticleBasicInfoDynamicSqlSupport.authorId,
                ArticleBasicInfoDynamicSqlSupport.language,
                ArticleBasicInfoDynamicSqlSupport.category,
                ArticleBasicInfoDynamicSqlSupport.createdDate,
                ArticleBasicInfoDynamicSqlSupport.updateDate
        )
                .from(ArticleBasicInfoDynamicSqlSupport.articleBasicInfo)
                .where(ArticleBasicInfoDynamicSqlSupport.articleId, isEqualTo(articleId))
                .build().render(RenderingStrategy.MYBATIS3);
        ArticleBasicInfo articleBasicInfoRecord = articleBasicInfoMapper.selectOne(selectStatementArticleBasicInfo);
        return new ArticleBasicInfoModel(
                articleBasicInfoRecord.getArticleId(),
                articleBasicInfoRecord.getArticleTitle(),
                articleBasicInfoRecord.getAuthorId(),
                articleBasicInfoRecord.getAuthorName(),
                articleBasicInfoRecord.getLanguage(),
                articleBasicInfoRecord.getCategory(),
                articleBasicInfoRecord.getCreatedDate(),
                articleBasicInfoRecord.getUpdateDate());
    }

}
