package com.memorandum.infrastructure.database.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserBasicInfoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user_basic_info")
    public static final UserBasicInfo userBasicInfo = new UserBasicInfo();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user_basic_info.user_id")
    public static final SqlColumn<String> userId = userBasicInfo.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user_basic_info.user_name")
    public static final SqlColumn<String> userName = userBasicInfo.userName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user_basic_info")
    public static final class UserBasicInfo extends SqlTable {
        public final SqlColumn<String> userId = column("user_id", JDBCType.VARCHAR);

        public final SqlColumn<String> userName = column("user_name", JDBCType.VARCHAR);

        public UserBasicInfo() {
            super("user_basic_info");
        }
    }
}