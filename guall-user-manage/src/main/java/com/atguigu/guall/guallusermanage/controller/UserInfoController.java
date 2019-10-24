package com.atguigu.guall.guallusermanage.controller;

import com.atguigu.guall.guallusermanage.bean.UserInfo;
import com.atguigu.guall.guallusermanage.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;
@RequestMapping("getUserInfo")
public List<UserInfo> getUserInfo(){
    return userInfoService.getUserInfo();


}
}
