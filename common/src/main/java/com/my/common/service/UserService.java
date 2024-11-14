package com.my.common.service;

import com.my.common.model.User;

/**
 * @author : golfar
 * @project : MyRPC
 * @description : 用户服务接口
 * @date : 2024-11-14 16:15
 **/
public interface UserService {

    /**
     * 获取用户
     *
     * @param user
     * @return
     */
    User getUser(User user);
}

