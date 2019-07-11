package com.huobanbengkui.properties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Girl {

    @Id
    @GeneratedValue
    private Integer id;

//    不能是null 并且长度大于0
    @NotBlank(message = "必传")
    private String cupSize;

    @Min(value = 18, message = "必须大于")
    private Integer age;

    @NotNull(message = "金额必传")
    private Double money;

    public Girl() {

    }

    @Override
    public String toString() {
        return "Girl" + "=" + id + "/" + cupSize + "/" + age + "/" + money;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
