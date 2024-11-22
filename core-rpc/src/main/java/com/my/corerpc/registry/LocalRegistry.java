package com.my.corerpc.registry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author : golfar
 * @project : MyRPC
 * @description : 本地服务注册器
 * @date : 2024-11-14 17:39
 **/
public class LocalRegistry {

    /**
     * 注册信息存储
     */
    private static final Map<String, Class<?>> map = new ConcurrentHashMap<>();

    /**
     * 服务注册方法
     * @param serviceName
     * @param serviceClass
     */
    public static void register(String serviceName, Class<?> serviceClass){
        map.put(serviceName, serviceClass);
    }

    /**
     * 获取服务实现类
     * @param serviceName
     * @return
     */
    public static Class<?> get(String serviceName){
        return map.get(serviceName);
    }

    /**
     * 注销服务
     * @param serviceName
     */
    public static void remove(String serviceName){
        map.remove(serviceName);
    }
}
