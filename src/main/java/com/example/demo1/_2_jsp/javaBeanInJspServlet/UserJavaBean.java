package com.example.demo1._2_jsp.javaBeanInJspServlet;

import java.io.Serializable;

public class UserJavaBean implements Serializable {
    private static final long serialVersionUID = 2041275512219239990L;

    private String name;
    private int age;

    public UserJavaBean() {
        this.name = "";
        this.age = 0;
    }
    public UserJavaBean(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
