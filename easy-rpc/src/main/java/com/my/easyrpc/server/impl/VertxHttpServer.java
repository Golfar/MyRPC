package com.my.easyrpc.server.impl;

import com.my.easyrpc.server.HttpServer;
import com.my.easyrpc.server.HttpServerHandler;
import io.vertx.core.Vertx;

/**
 * @author : golfar
 * @project : MyRPC
 * @description : Vert.x服务器实现类
 * @date : 2024-11-14 17:27
 **/
public class VertxHttpServer implements HttpServer {
    @Override
    public void doStart(int port) {
        // 创建 Vert.x 实例
        Vertx vertx = Vertx.vertx();

        // 创建 HTTP 服务器
        io.vertx.core.http.HttpServer server = vertx.createHttpServer();

        // 指定请求处理器
        server.requestHandler(new HttpServerHandler());

        // 启动 HTTP 服务器并监听指定端口
        server.listen(port, result -> {
            if (result.succeeded()) {
                System.out.println("Server is now listening on port " + port);
            } else {
                System.err.println("Failed to start server: " + result.cause());
            }
        });
    }
}