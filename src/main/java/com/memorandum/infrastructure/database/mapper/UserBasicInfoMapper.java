package com.memorandum.infrastructure.database.mapper;

import static com.memorandum.infrastructure.database.mapper.UserBasicInfoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.memorandum.infrastructure.database.record.UserBasicInfo;
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
public interface UserBasicInfoMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user_basic_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user_basic_info")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user_basic_info")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<UserBasicInfo> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user_basic_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UserBasicInfoResult")
    UserBasicInfo selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user_basic_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UserBasicInfoResult", value = {
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR)
    })
    List<UserBasicInfo> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user_basic_info")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user_basic_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(userBasicInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user_basic_info")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, userBasicInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user_basic_info")
    default int deleteByPrimaryKey(String userId_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, userBasicInfo)
                .where(userId, isEqualTo(userId_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user_basic_info")
    default int insert(UserBasicInfo record) {
        return insert(SqlBuilder.insert(record)
                .into(userBasicInfo)
                .map(userId).toProperty("userId")
                .map(userName).toProperty("userName")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user_basic_info")
    default int insertSelective(UserBasicInfo record) {
        return insert(SqlBuilder.insert(record)
                .into(userBasicInfo)
                .map(userId).toPropertyWhenPresent("userId", record::getUserId)
                .map(userName).toPropertyWhenPresent("userName", record::getUserName)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user_basic_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UserBasicInfo>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, userId, userName)
                .from(userBasicInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user_basic_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UserBasicInfo>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, userId, userName)
                .from(userBasicInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user_basic_info")
    default UserBasicInfo selectByPrimaryKey(String userId_) {
        return SelectDSL.selectWithMapper(this::selectOne, userId, userName)
                .from(userBasicInfo)
                .where(userId, isEqualTo(userId_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user_basic_info")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(UserBasicInfo record) {
        return UpdateDSL.updateWithMapper(this::update, userBasicInfo)
                .set(userId).equalTo(record::getUserId)
                .set(userName).equalTo(record::getUserName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user_basic_info")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(UserBasicInfo record) {
        return UpdateDSL.updateWithMapper(this::update, userBasicInfo)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(userName).equalToWhenPresent(record::getUserName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user_basic_info")
    default int updateByPrimaryKey(UserBasicInfo record) {
        return UpdateDSL.updateWithMapper(this::update, userBasicInfo)
                .set(userName).equalTo(record::getUserName)
                .where(userId, isEqualTo(record::getUserId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user_basic_info")
    default int updateByPrimaryKeySelective(UserBasicInfo record) {
        return UpdateDSL.updateWithMapper(this::update, userBasicInfo)
                .set(userName).equalToWhenPresent(record::getUserName)
                .where(userId, isEqualTo(record::getUserId))
                .build()
                .execute();
    }
}