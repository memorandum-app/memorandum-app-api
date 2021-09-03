package com.memorandum.infrastructure.repository;

import com.memorandum.domain.model.UserBasicInfoModel;
import com.memorandum.domain.repository.UserRepository;
import com.memorandum.infrastructure.database.mapper.UserBasicInfoDynamicSqlSupport;
import com.memorandum.infrastructure.database.mapper.UserBasicInfoMapper;
import com.memorandum.infrastructure.database.record.UserBasicInfo;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;


@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private UserBasicInfoMapper userBasicInfoMapper;

    @Override
    public UserBasicInfoModel getUserBasicInfoByUserId(String userId) {
        SelectStatementProvider selectStatementUserBasicInfo = SqlBuilder.select(UserBasicInfoDynamicSqlSupport.userId, UserBasicInfoDynamicSqlSupport.userName)
                .from(UserBasicInfoDynamicSqlSupport.userBasicInfo)
                .where(UserBasicInfoDynamicSqlSupport.userId, isEqualTo(userId))
                .build().render(RenderingStrategy.MYBATIS3);
        UserBasicInfo userBasicInfoRecord = userBasicInfoMapper.selectOne(selectStatementUserBasicInfo);
        return new UserBasicInfoModel(userBasicInfoRecord.getUserId(), userBasicInfoRecord.getUserName());
    }

    @Override
    public List<UserBasicInfoModel> getUserBasicInfoList() {
        SelectStatementProvider selectStatementUserBasicInfo = SqlBuilder.select(UserBasicInfoDynamicSqlSupport.userId, UserBasicInfoDynamicSqlSupport.userName)
                .from(UserBasicInfoDynamicSqlSupport.userBasicInfo)
                .build().render(RenderingStrategy.MYBATIS3);
        List<UserBasicInfo> userBasicInfoRecordList  = userBasicInfoMapper.selectMany(selectStatementUserBasicInfo);
        List<UserBasicInfoModel> userBasicInfoList = new ArrayList<>();
        for(UserBasicInfo userBasicInfoRecord : userBasicInfoRecordList) {
            userBasicInfoList.add(new UserBasicInfoModel(userBasicInfoRecord.getUserId(), userBasicInfoRecord.getUserName()));
        }
        return userBasicInfoList;
    }

}
