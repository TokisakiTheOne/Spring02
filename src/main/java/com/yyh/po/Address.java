package com.yyh.po;

/**
 * @author YanYuHang
 * @create 2019-10-26-16:29
 */
public  class Address {

    private String city;
    private String street;

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
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
}
