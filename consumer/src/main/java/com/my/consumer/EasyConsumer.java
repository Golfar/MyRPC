package com.my.consumer;

import com.my.common.model.User;
import com.my.common.service.UserService;
import com.my.easyrpc.proxy.ServiceProxyFactory;

/**
 * @author : golfar
 * @project : MyRPC
 * @description : 服务消费者启动类
 * @date : 2024-11-14 17:11
 **/
public class EasyConsumer {
    public static void main(String[] args) {
        // 动态代理
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setName("golfar");
        // 调用
        User newUser = userService.getUser(user);
        if (newUser != null) {
            System.out.println(newUser.getName());
        } else {
            System.out.println("user == null");
        }
    }
}
