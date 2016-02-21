package cn.codeyang.面试题;

import java.io.Serializable;

/**
 * Created by meicai on 2016/2/19
 */
public class Cat implements Serializable{
    private static final long serialVersionUID = 4501037221440814601L;
    private String name;
    private int age;

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
