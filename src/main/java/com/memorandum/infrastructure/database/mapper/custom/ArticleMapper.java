package com.memorandum.infrastructure.database.mapper.custom;

import com.memorandum.infrastructure.database.record.ArticleBasicInfo;
import com.memorandum.infrastructure.database.record.custom.Article;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.select.SelectDSL;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

import javax.annotation.Generated;
import java.util.List;

import static com.memorandum.infrastructure.database.mapper.ArticleBasicInfoDynamicSqlSupport.*;
import static com.memorandum.infrastructure.database.mapper.ArticleBasicInfoDynamicSqlSupport.articleId;
import static com.memorandum.infrastructure.database.mapper.ArticleContentDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.equalTo;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Mapper
public interface ArticleMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: article_basic_info_and_article_content")
    @SelectProvider(type= SqlProviderAdapter.class, method="select")
    @Results(id="ArticleResult", value = {
            @Result(column="article_id", property="articleId", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="article_title", property="articleTitle", jdbcType=JdbcType.VARCHAR),
            @Result(column="author_id", property="authorId", jdbcType=JdbcType.VARCHAR),
            @Result(column="author_name", property="authorName", jdbcType=JdbcType.VARCHAR),
            @Result(column="language", property="language", jdbcType=JdbcType.VARCHAR),
            @Result(column="category", property="category", jdbcType=JdbcType.VARCHAR),
            @Result(column="created_date", property="createdDate", jdbcType=JdbcType.DATE),
            @Result(column="update_date", property="updateDate", jdbcType=JdbcType.DATE),
            @Result(column="content_id", property="contentId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="article_id", property="articleId", jdbcType=JdbcType.INTEGER),
            @Result(column="style_1", property="style1", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_2", property="style2", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_3", property="style3", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_4", property="style4", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_5", property="style5", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_6", property="style6", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_7", property="style7", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_8", property="style8", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_9", property="style9", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_10", property="style10", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_11", property="style11", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_12", property="style12", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_13", property="style13", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_14", property="style14", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_15", property="style15", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_16", property="style16", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_17", property="style17", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_18", property="style18", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_19", property="style19", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_20", property="style20", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_21", property="style21", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_22", property="style22", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_23", property="style23", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_24", property="style24", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_25", property="style25", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_26", property="style26", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_27", property="style27", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_28", property="style28", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_29", property="style29", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_30", property="style30", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_31", property="style31", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_32", property="style32", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_33", property="style33", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_34", property="style34", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_35", property="style35", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_36", property="style36", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_37", property="style37", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_38", property="style38", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_39", property="style39", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_40", property="style40", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_41", property="style41", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_42", property="style42", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_43", property="style43", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_44", property="style44", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_45", property="style45", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_46", property="style46", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_47", property="style47", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_48", property="style48", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_49", property="style49", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_50", property="style50", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_51", property="style51", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_52", property="style52", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_53", property="style53", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_54", property="style54", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_55", property="style55", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_56", property="style56", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_57", property="style57", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_58", property="style58", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_59", property="style59", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_60", property="style60", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_61", property="style61", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_62", property="style62", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_63", property="style63", jdbcType=JdbcType.VARCHAR),
            @Result(column="style_64", property="style64", jdbcType=JdbcType.VARCHAR),
            @Result(column="content_1", property="content1", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_1", property="option1", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_2", property="content2", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_2", property="option2", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_3", property="content3", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_3", property="option3", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_4", property="content4", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_4", property="option4", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_5", property="content5", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_5", property="option5", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_6", property="content6", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_6", property="option6", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_7", property="content7", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_7", property="option7", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_8", property="content8", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_8", property="option8", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_9", property="content9", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_9", property="option9", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_10", property="content10", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_10", property="option10", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_11", property="content11", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_11", property="option11", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_12", property="content12", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_12", property="option12", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_13", property="content13", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_13", property="option13", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_14", property="content14", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_14", property="option14", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_15", property="content15", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_15", property="option15", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_16", property="content16", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_16", property="option16", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_17", property="content17", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_17", property="option17", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_18", property="content18", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_18", property="option18", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_19", property="content19", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_19", property="option19", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_20", property="content20", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_20", property="option20", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_21", property="content21", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_21", property="option21", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_22", property="content22", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_22", property="option22", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_23", property="content23", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_23", property="option23", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_24", property="content24", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_24", property="option24", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_25", property="content25", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_25", property="option25", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_26", property="content26", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_26", property="option26", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_27", property="content27", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_27", property="option27", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_28", property="content28", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_28", property="option28", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_29", property="content29", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_29", property="option29", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_30", property="content30", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_30", property="option30", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_31", property="content31", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_31", property="option31", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_32", property="content32", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_32", property="option32", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_33", property="content33", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_33", property="option33", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_34", property="content34", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_34", property="option34", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_35", property="content35", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_35", property="option35", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_36", property="content36", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_36", property="option36", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_37", property="content37", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_37", property="option37", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_38", property="content38", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_38", property="option38", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_39", property="content39", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_39", property="option39", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_40", property="content40", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_40", property="option40", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_41", property="content41", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_41", property="option41", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_42", property="content42", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_42", property="option42", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_43", property="content43", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_43", property="option43", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_44", property="content44", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_44", property="option44", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_45", property="content45", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_45", property="option45", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_46", property="content46", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_46", property="option46", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_47", property="content47", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_47", property="option47", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_48", property="content48", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_48", property="option48", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_49", property="content49", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_49", property="option49", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_50", property="content50", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_50", property="option50", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_51", property="content51", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_51", property="option51", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_52", property="content52", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_52", property="option52", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_53", property="content53", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_53", property="option53", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_54", property="content54", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_54", property="option54", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_55", property="content55", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_55", property="option55", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_56", property="content56", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_56", property="option56", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_57", property="content57", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_57", property="option57", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_58", property="content58", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_58", property="option58", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_59", property="content59", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_59", property="option59", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_60", property="content60", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_60", property="option60", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_61", property="content61", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_61", property="option61", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_62", property="content62", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_62", property="option62", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_63", property="content63", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_63", property="option63", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="content_64", property="content64", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="option_64", property="option64", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Article> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: article_basic_info_and_article_content")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ArticleResult")
    Article selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: article_basic_info_and_article_content")
    default Article selectByPrimaryKey(Integer articleId_) {
        return SelectDSL.selectWithMapper(this::selectOne, articleId, articleTitle, authorId, authorName, language, category, createdDate, updateDate,
                style1, content1, option1,
                style2, content2, option2,
                style3, content3, option3,
                style4, content4, option4,
                style5, content5, option5,
                style6, content6, option6,
                style7, content7, option7,
                style8, content8, option8,
                style9, content9, option9,
                style10, content10, option10,
                style11, content11, option11,
                style12, content12, option12,
                style13, content13, option13,
                style14, content14, option14,
                style15, content15, option15,
                style16, content16, option16,
                style17, content17, option17,
                style18, content18, option18,
                style19, content19, option19,
                style20, content20, option20,
                style21, content21, option21,
                style22, content22, option22,
                style23, content23, option23,
                style24, content24, option24,
                style25, content25, option25,
                style26, content26, option26,
                style27, content27, option27,
                style28, content28, option28,
                style29, content29, option29,
                style30, content30, option30,
                style31, content31, option31,
                style32, content32, option32,
                style33, content33, option33,
                style34, content34, option34,
                style35, content35, option35,
                style36, content36, option36,
                style37, content37, option37,
                style38, content38, option38,
                style39, content39, option39,
                style40, content40, option40,
                style41, content41, option41,
                style42, content42, option42,
                style43, content43, option43,
                style44, content44, option44,
                style45, content45, option45,
                style46, content46, option46,
                style47, content47, option47,
                style48, content48, option48,
                style49, content49, option49,
                style50, content50, option50,
                style51, content51, option51,
                style52, content52, option52,
                style53, content53, option53,
                style54, content54, option54,
                style55, content55, option55,
                style56, content56, option56,
                style57, content57, option57,
                style58, content58, option58,
                style59, content59, option59,
                style60, content60, option60,
                style61, content61, option61,
                style62, content62, option62,
                style63, content63, option63,
                style64, content64, option64)
                .from(articleBasicInfo, "abi")
                .leftJoin(articleContent, "ac")
                .on(articleBasicInfo.articleId, equalTo(articleContent.articleId))
                .where(articleId, isEqualTo(articleId_))
                .build()
                .execute();
    }
}