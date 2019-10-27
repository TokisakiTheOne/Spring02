package com.yyh.po;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author YanYuHang
 * @create 2019-10-25-18:36
 */
@Component
public class HelloWorld {

    private String name;
    private List<String> list;
    private Map<String, Object> map;
    private Set<Object> set;
    private String[] strs;
    private Date date;

    public HelloWorld(String name) {
        this.name = name;
    }

    public HelloWorld(String name, List<String> list) {
        this.name = name;
        this.list = list;
    }

    public HelloWorld(String name, List<String> list, Map<String, Object> map) {
        this.name = name;
        this.list = list;
        this.map = map;
    }

    public HelloWorld() {
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "name='" + name + '\'' +
                ", list=" + list +
                ", map=" + map +
                ", set=" + set +
                ", strs=" + Arrays.toString(strs) +
                ", date=" + date +
                '}';
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String[] getStrs() {
        return strs;
    }

    public void setStrs(String[] strs) {
        this.strs = strs;
    }

    public Set<Object> getSet() {
        return set;
    }

    public void setSet(Set<Object> set) {
        this.set = set;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
