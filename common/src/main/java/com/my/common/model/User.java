package com.my.common.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author : golfar
 * @project : MyRPC
 * @description : 用户实体类
 * @date : 2024-11-14 16:13
 **/
@Data
public class User implements Serializable {

    private String name;

}

