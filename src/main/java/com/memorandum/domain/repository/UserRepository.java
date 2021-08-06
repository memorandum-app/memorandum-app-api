package com.memorandum.domain.repository;

import com.memorandum.domain.model.UserBasicInfoModel;

import java.util.List;

public interface UserRepository {
    public UserBasicInfoModel getUserBasicInfoByUserId(String userId);
    public List<UserBasicInfoModel> getUserBasicInfoList();
}
