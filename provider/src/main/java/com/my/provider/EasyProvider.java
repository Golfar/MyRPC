package com.my.provider;

import com.my.common.service.UserService;
import com.my.easyrpc.registry.LocalRegistry;
import com.my.easyrpc.server.impl.VertxHttpServer;
import com.my.provider.service.impl.UserServiceImpl;

/**
 * @author : golfar
 * @project : MyRPC
 * @description : 服务提供者启动类
 * @date : 2024-11-14 17:09
 **/
public class EasyProvider {
    public static void main(String[] args) {
        // 注册服务
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);

        // 启动 web 服务
        VertxHttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}
