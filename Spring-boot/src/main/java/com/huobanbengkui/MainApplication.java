package com.huobanbengkui;

import com.huobanbengkui.common.RedisUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.scheduling.annotation.EnableScheduling;



/*
* @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
* */

//开启定时任务
//@EnableScheduling

@MapperScan("com.huobanbengkui.MyBatis")

//网管路由
//@EnableZuulProxy

@SpringBootApplication

//@CrossOrigin
public class MainApplication {


    public static void main(String[] args) {
        //Spring 应用启动起来

        SpringApplication.run(MainApplication.class, args);

    }
}

/*
* 1: 使用java -jar  xx.jar  可以直接运行打出来的jar包
* 2：spring-boot-start : spring boot 场景启动器，帮我们导入了web模块正常运行所依赖的组件;
* 3：使用项目创建向导，快速创建一个Spring Boot项目；
* 4：在SpringBoot 官网中 通过Common application properties 查看配置文件中，可以配置那些选项
* 5：自动配置原理：
* 6：日志系统：SLF4J框架  日志实现：LogBack 导入slf4j.jar 和 logback.jar
* 7: bootstrap  前端模板工程页面
* 8：https://www.webjars.org/  使用webjars统一管理静态资源
* 9：模板引擎，有JSP，Velocity, Freemarker,Thymeleaf
* 10：Spring Boot 热部署 在调试和程序发布以后，无需重启服务器；
* 11: Redis运行在内存中，可以用来存储临时变量的数据库存储
*
* 12: 组件自动装配：模式注解， @Enable 模块，条件装配，加载机制
* 13：外部化配置：Environment抽象，生命周期，破坏性变更
* 14：Servlet Web 容器， Reactive web 容器
*
* 15：mybatis-plus 增强操作库
*
* 16：AOP编程使用场景：权限控制，缓存控制，事务控制，审计日志，性能监控，分布式追踪，异常处理；
*
*/