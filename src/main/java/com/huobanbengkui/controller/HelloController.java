package com.huobanbengkui.controller;

import com.huobanbengkui.MainApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


//这个类的所有方法，返回的数据，直接写给浏览器
//@ResponseBody
//@Controller
//CrossOrigin  解决跨域访问问题
@RestController
@CrossOrigin
public class HelloController {

//@Autowired自动注解，举个例子吧，一个类，俩个实现类，Autowired就不知道注入哪一个实现类，而Resource有name属性，可以区分。
    @Autowired(required = false)
    Person person;

    Logger logger = LoggerFactory.getLogger(MainApplication.class);
    @RequestMapping("/hello")
//    数据在bodyText 中
    public String hello()
    {
//        日志级别 由低到高  可以调整日志的输出级别 loggin.level

        logger.trace("跟踪信息");
        logger.debug("调试信息");
        logger.info("日志信息");
        logger.warn("");
        logger.error("");
        System.out.print(person.toString());
        return "Hello world124";
    }
}
