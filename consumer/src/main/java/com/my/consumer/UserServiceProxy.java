package com.my.consumer;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import com.my.common.model.User;
import com.my.common.service.UserService;
import com.my.easyrpc.model.RpcRequest;
import com.my.easyrpc.model.RpcResponse;
import com.my.easyrpc.serializer.impl.JdkSerializer;

/**
 * @author : golfar
 * @project : MyRPC
 * @description : UserService代理类
 * @date : 2024-11-14 18:38
 **/
public class UserServiceProxy implements UserService {
    @Override
    public User getUser(User user) {
        JdkSerializer serializer = new JdkSerializer();

        // 发请求
        RpcRequest rpcRequest = RpcRequest.builder()
                .serviceName(UserService.class.getName())
                .methodName("getUser")
                .parameterTypes(new Class[]{User.class})
                .args(new Object[]{user})
                .build();
        try{
            byte[] bodyBytes = serializer.serialize(rpcRequest);
            byte[] result;
            try(HttpResponse httpResponse = HttpRequest.post("http://localhost:8080")
                    .body(bodyBytes)
                    .execute()){
                result = httpResponse.bodyBytes();
            }
            RpcResponse rpcResponse = serializer.deserialize(result, RpcResponse.class);
            return (User) rpcResponse.getData();
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
