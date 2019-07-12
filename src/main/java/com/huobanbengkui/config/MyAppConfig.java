package com.huobanbengkui.config;


import com.huobanbengkui.services.HelloServices;
import org.apache.catalina.filters.CorsFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration 指明当前类为一个配置类，用来替代之前的配置文件
//配置类是自动执行的


@Configuration
public class MyAppConfig {

    //将方法的返回值，添加到容器中,容器中这个组件的默认ID 就是方法名
    @Bean
    public HelloServices services() {
//        System.out.print("123445556666777777");
        return new HelloServices();
    }

//    全局配置跨域
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**");
             }
     };
}

}
