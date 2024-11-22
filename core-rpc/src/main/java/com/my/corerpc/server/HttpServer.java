package com.my.corerpc.server;

/**
 * @author : golfar
 * @project : MyRPC
 * @description : http服务器启动接口
 * @date : 2024-11-14 17:25
 **/
public interface HttpServer {

        /**
         * 启动服务器
         *
         * @param port
         */
        void doStart(int port);
}
