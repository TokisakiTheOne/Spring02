package com.yyh.po;

/**
 * @author YanYuHang
 * @create 2019-10-26-16:42
 */
public class NewAddress {

    private String city;
    private String street;

    private String name;
    private String sex;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "NewAddress{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
