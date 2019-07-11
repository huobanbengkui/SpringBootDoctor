package com.huobanbengkui.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/*
* 将配置文件中配置的值，映射到这个文件中
* @ConfigurationProperties 讲本类中的所有属性和配置文件中相关的配置进行绑定  默认从全局配置文件中获取
* 需要绑定spring-boot-configuration-processor 配置
* 只有加入Spring-boot 容器中，才能起作用  @Component
*
* @PropertySource(value = {"classpath:application.yml"})  从指定文件，读取配置
* @ImportResource(locations = {"classpath:application.yml"})  导入Spring的配置文件，让配置文件的内容生效
*
* */



@Component
@ConfigurationProperties(prefix = "person")

public class Person {

    @Value("${person.lastName}")  //一个一个指定注入
    private String lastName;
    private Integer age;
    private Boolean boss;
    private Date brith;

    private Map<String, Object> map;
    private List<Object> lists;

    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", brith=" + brith +
                ", map=" + map +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBrith() {
        return brith;
    }

    public void setBrith(Date brith) {
        this.brith = brith;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
