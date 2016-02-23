package cn.codeyang.thread04;

/**
 * Created by meicai on 2016/2/21
 */
public class MyLockDemo {
    public static void main(String[] args) {
        MyLock lock = new MyLock();

        Thread t1 = new Thread(lock);
        Thread t2 = new Thread(lock);
        Thread t3 = new Thread(lock);

        t1.start();
        t2.start();
        t3.start();
    }
}
