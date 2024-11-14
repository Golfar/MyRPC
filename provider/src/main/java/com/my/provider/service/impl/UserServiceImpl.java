package com.my.provider.service.impl;

import com.my.common.model.User;
import com.my.common.service.UserService;

/**
 * @author : golfar
 * @project : MyRPC
 * @description : 用户服务实现类
 * @date : 2024-11-14 17:06
 **/
public class UserServiceImpl implements UserService {
    @Override
    public User getUser(User user) {
        System.out.println(user.getName());
        return user;
    }
}
