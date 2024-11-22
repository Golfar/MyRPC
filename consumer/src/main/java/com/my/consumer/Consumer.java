package com.my.consumer;

import com.my.corerpc.config.RpcConfig;
import com.my.corerpc.utils.ConfigUtils;

/**
 * 服务消费者实例
 */
public class Consumer {

    public static void main(String[] args) {
        RpcConfig rpcConfig = ConfigUtils.loadConfig(RpcConfig.class, "rpc");
        System.out.println(rpcConfig.toString());
    }
}
