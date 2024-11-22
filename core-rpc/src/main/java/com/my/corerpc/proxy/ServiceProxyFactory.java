package com.my.corerpc.proxy;

import java.lang.reflect.Proxy;

/**
 * @author : golfar
 * @project : MyRPC
 * @description : 代理类工厂
 * @date : 2024-11-14 18:58
 **/
public class ServiceProxyFactory {

    public static <T> T getProxy(Class<T> serviceClass){
        return (T) Proxy.newProxyInstance(
                serviceClass.getClassLoader(),
                new Class[]{serviceClass},
                new ServiceProxy()
        );
    }
}
