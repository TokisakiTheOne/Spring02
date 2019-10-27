package com.yyh.po;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @Component      适用于所有层
 * @Service        适用于Service业务逻辑层
 * @Repository     适用于持久层
 * @Controller     适用于Controller  控制层
 * @author YanYuHang
 * @create 2019-10-27-11:49
 */

@Component("testBean")
@Scope("prototype")
public class TestBean {

    private String name;

    private String sex;
    @Autowired
    private HelloWorld helloWorld;

    @Override
    public String toString() {
        return "TestBean{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", helloWorld=" + helloWorld +
                '}';
    }

    /**
     * 相当于  initMethod  初始化方法
     */
    @PostConstruct
    public void start() {
        System.out.println("TestBean初始化....");
    }

    /**
     * 相当于  destoryMethod  销毁方法
     */
    @PreDestroy
    public void cleanUp() {
        System.out.println("TestBean销毁....");
    }

    public String getName() {
        return name;
    }
    @Value("张三")
    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }
    @Value("女")
    public void setSex(String sex) {
        this.sex = sex;
    }

    public HelloWorld getHelloWorld() {
        return helloWorld;
    }

    public void setHelloWorld(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }
}
