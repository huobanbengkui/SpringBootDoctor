package com.huobanbengkui.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisUtil {

    @Autowired
    private StringRedisTemplate template;


    public RedisUtil() {

    }

    public void keyWithValue(String key, String value) {
        template.opsForValue().set(key, value);
    }

    public String getVale(String key) {
        return  (String) template.opsForValue().get(key);
    }
}
/*
* 1: 本地安装Redis服务
* 2：启动Redis服务
* 3：编写Spring Boot代码
* 4：运行代码。连接Redis，进行数据操作
* */
