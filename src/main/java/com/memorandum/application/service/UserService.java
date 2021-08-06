package com.memorandum.application.service;

import com.memorandum.domain.model.UserBasicInfoModel;
import com.memorandum.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserBasicInfoModel getUserBasicInfoByUserId(String userId) {
        return userRepository.getUserBasicInfoByUserId(userId);
    }

    public List<UserBasicInfoModel> getUserBasicInfoList() {
        return userRepository.getUserBasicInfoList();
    }
}
