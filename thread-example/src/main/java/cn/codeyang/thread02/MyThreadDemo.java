package cn.codeyang.thread02;

/**
 * Created by meicai on 2016/2/19
 */
public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("mt1");
        MyThread mt2 = new MyThread("mt2");

        mt1.start();
        mt2.start();
    }
}
