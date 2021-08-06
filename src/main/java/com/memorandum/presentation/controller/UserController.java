package com.memorandum.presentation.controller;

import com.memorandum.application.service.UserService;
import com.memorandum.domain.model.UserBasicInfoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("id")
    public UserBasicInfoModel getUserBasicInfoByUserId(@RequestParam("userId") String userId) {
        return userService.getUserBasicInfoByUserId(userId);
    }

    @GetMapping("list")
    public List<UserBasicInfoModel> getUserBasicInfoList() {
        return userService.getUserBasicInfoList();
    }
}
