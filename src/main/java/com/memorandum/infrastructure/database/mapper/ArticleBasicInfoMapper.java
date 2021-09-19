package com.memorandum.infrastructure.database.mapper;

import static com.memorandum.infrastructure.database.mapper.ArticleBasicInfoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.memorandum.infrastructure.database.record.ArticleBasicInfo;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.delete.DeleteDSL;
import org.mybatis.dynamic.sql.delete.MyBatis3DeleteModelAdapter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.MyBatis3SelectModelAdapter;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSL;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.MyBatis3UpdateModelAdapter;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

@Mapper
public interface ArticleBasicInfoMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: article_basic_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: article_basic_info")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: article_basic_info")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ArticleBasicInfo> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: article_basic_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ArticleBasicInfoResult")
    ArticleBasicInfo selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: article_basic_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ArticleBasicInfoResult", value = {
        @Result(column="article_id", property="articleId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="article_title", property="articleTitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="author_id", property="authorId", jdbcType=JdbcType.VARCHAR),
        @Result(column="author_name", property="authorName", jdbcType=JdbcType.VARCHAR),
        @Result(column="language", property="language", jdbcType=JdbcType.VARCHAR),
        @Result(column="category", property="category", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_date", property="createdDate", jdbcType=JdbcType.DATE),
        @Result(column="update_date", property="updateDate", jdbcType=JdbcType.DATE)
    })
    List<ArticleBasicInfo> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: article_basic_info")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: article_basic_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(articleBasicInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: article_basic_info")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, articleBasicInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: article_basic_info")
    default int deleteByPrimaryKey(Integer articleId_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, articleBasicInfo)
                .where(articleId, isEqualTo(articleId_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: article_basic_info")
    default int insert(ArticleBasicInfo record) {
        return insert(SqlBuilder.insert(record)
                .into(articleBasicInfo)
                .map(articleId).toProperty("articleId")
                .map(articleTitle).toProperty("articleTitle")
                .map(authorId).toProperty("authorId")
                .map(authorName).toProperty("authorName")
                .map(language).toProperty("language")
                .map(category).toProperty("category")
                .map(createdDate).toProperty("createdDate")
                .map(updateDate).toProperty("updateDate")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: article_basic_info")
    default int insertSelective(ArticleBasicInfo record) {
        return insert(SqlBuilder.insert(record)
                .into(articleBasicInfo)
                .map(articleId).toPropertyWhenPresent("articleId", record::getArticleId)
                .map(articleTitle).toPropertyWhenPresent("articleTitle", record::getArticleTitle)
                .map(authorId).toPropertyWhenPresent("authorId", record::getAuthorId)
                .map(authorName).toPropertyWhenPresent("authorName", record::getAuthorName)
                .map(language).toPropertyWhenPresent("language", record::getLanguage)
                .map(category).toPropertyWhenPresent("category", record::getCategory)
                .map(createdDate).toPropertyWhenPresent("createdDate", record::getCreatedDate)
                .map(updateDate).toPropertyWhenPresent("updateDate", record::getUpdateDate)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: article_basic_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ArticleBasicInfo>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, articleId, articleTitle, authorId, authorName, language, category, createdDate, updateDate)
                .from(articleBasicInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: article_basic_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ArticleBasicInfo>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, articleId, articleTitle, authorId, authorName, language, category, createdDate, updateDate)
                .from(articleBasicInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: article_basic_info")
    default ArticleBasicInfo selectByPrimaryKey(Integer articleId_) {
        return SelectDSL.selectWithMapper(this::selectOne, articleId, articleTitle, authorId, authorName, language, category, createdDate, updateDate)
                .from(articleBasicInfo)
                .where(articleId, isEqualTo(articleId_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: article_basic_info")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ArticleBasicInfo record) {
        return UpdateDSL.updateWithMapper(this::update, articleBasicInfo)
                .set(articleId).equalTo(record::getArticleId)
                .set(articleTitle).equalTo(record::getArticleTitle)
                .set(authorId).equalTo(record::getAuthorId)
                .set(authorName).equalTo(record::getAuthorName)
                .set(language).equalTo(record::getLanguage)
                .set(category).equalTo(record::getCategory)
                .set(createdDate).equalTo(record::getCreatedDate)
                .set(updateDate).equalTo(record::getUpdateDate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: article_basic_info")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ArticleBasicInfo record) {
        return UpdateDSL.updateWithMapper(this::update, articleBasicInfo)
                .set(articleId).equalToWhenPresent(record::getArticleId)
                .set(articleTitle).equalToWhenPresent(record::getArticleTitle)
                .set(authorId).equalToWhenPresent(record::getAuthorId)
                .set(authorName).equalToWhenPresent(record::getAuthorName)
                .set(language).equalToWhenPresent(record::getLanguage)
                .set(category).equalToWhenPresent(record::getCategory)
                .set(createdDate).equalToWhenPresent(record::getCreatedDate)
                .set(updateDate).equalToWhenPresent(record::getUpdateDate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: article_basic_info")
    default int updateByPrimaryKey(ArticleBasicInfo record) {
        return UpdateDSL.updateWithMapper(this::update, articleBasicInfo)
                .set(articleTitle).equalTo(record::getArticleTitle)
                .set(authorId).equalTo(record::getAuthorId)
                .set(authorName).equalTo(record::getAuthorName)
                .set(language).equalTo(record::getLanguage)
                .set(category).equalTo(record::getCategory)
                .set(createdDate).equalTo(record::getCreatedDate)
                .set(updateDate).equalTo(record::getUpdateDate)
                .where(articleId, isEqualTo(record::getArticleId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: article_basic_info")
    default int updateByPrimaryKeySelective(ArticleBasicInfo record) {
        return UpdateDSL.updateWithMapper(this::update, articleBasicInfo)
                .set(articleTitle).equalToWhenPresent(record::getArticleTitle)
                .set(authorId).equalToWhenPresent(record::getAuthorId)
                .set(authorName).equalToWhenPresent(record::getAuthorName)
                .set(language).equalToWhenPresent(record::getLanguage)
                .set(category).equalToWhenPresent(record::getCategory)
                .set(createdDate).equalToWhenPresent(record::getCreatedDate)
                .set(updateDate).equalToWhenPresent(record::getUpdateDate)
                .where(articleId, isEqualTo(record::getArticleId))
                .build()
                .execute();
    }
}