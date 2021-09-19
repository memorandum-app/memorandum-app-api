package com.memorandum.infrastructure.database.mapper;

import java.sql.JDBCType;
import java.time.LocalDate;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ArticleBasicInfoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: article_basic_info")
    public static final ArticleBasicInfo articleBasicInfo = new ArticleBasicInfo();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: article_basic_info.article_id")
    public static final SqlColumn<Integer> articleId = articleBasicInfo.articleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: article_basic_info.article_title")
    public static final SqlColumn<String> articleTitle = articleBasicInfo.articleTitle;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: article_basic_info.author_id")
    public static final SqlColumn<String> authorId = articleBasicInfo.authorId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: article_basic_info.author_name")
    public static final SqlColumn<String> authorName = articleBasicInfo.authorName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: article_basic_info.language")
    public static final SqlColumn<String> language = articleBasicInfo.language;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: article_basic_info.category")
    public static final SqlColumn<String> category = articleBasicInfo.category;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: article_basic_info.created_date")
    public static final SqlColumn<LocalDate> createdDate = articleBasicInfo.createdDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: article_basic_info.update_date")
    public static final SqlColumn<LocalDate> updateDate = articleBasicInfo.updateDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: article_basic_info")
    public static final class ArticleBasicInfo extends SqlTable {
        public final SqlColumn<Integer> articleId = column("article_id", JDBCType.INTEGER);

        public final SqlColumn<String> articleTitle = column("article_title", JDBCType.VARCHAR);

        public final SqlColumn<String> authorId = column("author_id", JDBCType.VARCHAR);

        public final SqlColumn<String> authorName = column("author_name", JDBCType.VARCHAR);

        public final SqlColumn<String> language = column("language", JDBCType.VARCHAR);

        public final SqlColumn<String> category = column("category", JDBCType.VARCHAR);

        public final SqlColumn<LocalDate> createdDate = column("created_date", JDBCType.DATE);

        public final SqlColumn<LocalDate> updateDate = column("update_date", JDBCType.DATE);

        public ArticleBasicInfo() {
            super("article_basic_info");
        }
    }
}