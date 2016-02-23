package cn.codeyang.面试题.demo01;

/**
 * Created by meicai on 2016/2/22
 */
public class Person implements Runnable {
    private String name;
    private Cave cave;

    public Person(Cave cave) {
        this.cave = cave;
    }

    public void run() {
        cave.pass(this);
    }

    public String getName() {
        return Thread.currentThread().getName();
    }
}
