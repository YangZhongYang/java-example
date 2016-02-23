package cn.codeyang.thread04;

/**
 * Created by meicai on 2016/2/21
 */
public class MyRunnableDemo {
    public static void main(String[] args) {
        MyRunnable mr1 = new MyRunnable();
        MyRunnable mr2 = new MyRunnable();

        Thread t1 = new Thread(mr1);
        Thread t2 = new Thread(mr2);

        t1.start();
        t2.start();
    }
}
