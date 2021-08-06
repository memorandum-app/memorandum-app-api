package com.memorandum.infrastructure.database.record;

import javax.annotation.Generated;

public class UserBasicInfo {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user_basic_info.user_id")
    private String userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user_basic_info.user_name")
    private String userName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user_basic_info.user_id")
    public String getUserId() {
        return userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user_basic_info.user_id")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user_basic_info.user_name")
    public String getUserName() {
        return userName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user_basic_info.user_name")
    public void setUserName(String userName) {
        this.userName = userName;
    }
}