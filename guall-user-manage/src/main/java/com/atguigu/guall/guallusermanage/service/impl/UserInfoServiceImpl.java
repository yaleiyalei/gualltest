package com.atguigu.guall.guallusermanage.service.impl;

import com.atguigu.guall.guallusermanage.bean.UserInfo;
import com.atguigu.guall.guallusermanage.mapper.UserInfoMapper;
import com.atguigu.guall.guallusermanage.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
@Autowired
    UserInfoMapper userInfoMapper;
    @Override
    public List<UserInfo> getUserInfo() {
        return userInfoMapper.selectAll();
    }
}
