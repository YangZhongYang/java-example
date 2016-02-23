package cn.codeyang.面试题.demo01;

/**
 * Created by meicai on 2016/2/22
 */
public class Demo01 {
    public static void main(String[] args) {
        Cave cave = new Cave();

        Person person = new Person(cave);

        Thread t1 = new Thread(person);
        Thread t2 = new Thread(person);
        Thread t3 = new Thread(person);
        Thread t4 = new Thread(person);
        Thread t5 = new Thread(person);

        t1.setName("张三");
        t2.setName("李四");
        t3.setName("王五");
        t4.setName("赵六");
        t5.setName("孙七");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }
}
