package com.my.provider;

import com.my.common.service.UserService;
import com.my.corerpc.RpcApplication;
import com.my.corerpc.registry.LocalRegistry;
import com.my.corerpc.server.impl.VertxHttpServer;
import com.my.provider.service.impl.UserServiceImpl;

/**
 * 服务提供者示例类
 */
public class Provider {

    public static void main(String[] args) {
        // RPC框架初始化
        RpcApplication.init();
        // 注册服务
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);
        // 启动web服务
        VertxHttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(RpcApplication.getRpcConfig().getServerPort());
    }
}
