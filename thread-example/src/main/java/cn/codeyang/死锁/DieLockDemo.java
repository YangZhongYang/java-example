package cn.codeyang.死锁;

/**
 * Created by meicai on 2016/2/21
 */
public class DieLockDemo {
    public static void main(String[] args) {
        DieLock dl1 = new DieLock(true);
        DieLock dl2 = new DieLock(false);

        Thread t1 = new Thread(dl1);
        Thread t2 = new Thread(dl2);

        t1.start();
        t2.start();
    }

}
