package com.huobanbengkui.properties;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

//controll增强器，添加全局配置

@ControllerAdvice
public class ExceptionHandle {

//responseBody一般是作用在方法上的，加上该注解表示该方法的返回结果直接写到Http response Body中，常用在ajax异步请求中，

//在RequestMapping中 return返回值默认解析为跳转路径，如果你此时想让Controller返回一个字符串或者对象到前台 就会报404 not response的错误。

//当加上@ResponseBody注解后不会解析成跳转地址 会解析成相应的json格式的对象 集合 字符串或者xml等直接返回给前台 可以通过 ajax 的“success”：fucntion(data){} data直接获取到。


    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        if (e instanceof GirlException) {
            GirlException girlException = (GirlException)e;
            return ResultUtil.error(girlException.getCode(), girlException.getMessage());
        }else {
            return ResultUtil.error(-1, "未知错误");
        }
    }


}
