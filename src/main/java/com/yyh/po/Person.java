package com.yyh.po;

/**
 * @author YanYuHang
 * @create 2019-10-26-17:09
 */
public class Person {
    //懒汉模式  最优方法
    /*private volatile static Person person = null;
    public static Person getPerson() {
        if (person == null) {
            synchronized (Person.class) {
                if (person == null) {
                    person = new Person();
                }
            }
        }
        return person;
    }
*/


    /**
     *  饿汉模式
     */
    /**
     * 内部类  静态内部类  和外面的类 没有绑定关系，并且只有调用的时候才能被装载
     *   从而实现了延迟加载
     */
    private static class PersonHolder{
        /**
         * 静态初始化器  用JVM保证线程安全
         */
        private static Person person=new Person();
    }
    public static Person getPerson(){
        return PersonHolder.person;
    }

    private Person() {

    }

    /**
     * 1. 全局共享，独一份；
     *
     * 2. 构造函数不暴露（如果暴露便不能保证一份），自己负责自己的构造；
     *
     * 3. 懒汉式：Lazy load，用到才加载，非线程安全。如何保证线程安全呢：
     *
     * （1） synchronized getInstance()。
     *
     * （2）双重检查加锁（volatile）。
     *
     * 4. 饿汉式：一开始就申请好，浪费了点资源，但其线程安全。
     *
     * 5. Holder模式：
     *
     * （1）改成内部类，由JVM保证线程安全性。
     */

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
