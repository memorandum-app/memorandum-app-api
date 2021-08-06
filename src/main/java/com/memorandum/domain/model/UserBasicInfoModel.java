package com.memorandum.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserBasicInfoModel {
    private String userId;
    private String userName;

    public UserBasicInfoModel(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }
}
