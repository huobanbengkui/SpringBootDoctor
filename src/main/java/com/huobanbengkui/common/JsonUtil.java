package com.huobanbengkui.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class JsonUtil {
    /**
     *
     * @Title: JsonUtils.java
     * @Package com.lee.utils
     * @Description: 自定义响应结构, 转换类
     * Copyright: Copyright (c) 2016
     * Company:Nathan.Lee.Salvatore
     *
     * @author leechenxiang
     * @date 2016年4月29日 下午11:05:03
     * @version V1.0
     */

    //定义Jackson对象
    private static final ObjectMapper mapper = new ObjectMapper();

    //将对象转换为Json字符串
    public static String objectToJson(Object data) {
        try {
            String string = mapper.writeValueAsString(data);
            return string;
        }catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    //将Json转换为对象
    public static <T> T jsonToPojo(String jsonData, Class<T> beanType) {
        try {
            T t = mapper.readValue(jsonData, beanType);
            return t;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //将json数据转换为pojo对象List
    public static <T>List<T> jsonToList(String jsonData, Class<T> beanType) {
        JavaType javaType = mapper.getTypeFactory().constructParametricType(List.class, beanType);
        try {
            List<T> list = mapper.readValue(jsonData, javaType);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }


}
