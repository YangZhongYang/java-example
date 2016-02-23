package cn.codeyang.thread04;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by meicai on 2016/2/21
 */
public class MyLock implements Runnable {

    private static int ticket = 100;
    Lock lock = new ReentrantLock();

    public void run() {
        while (true){
            lock.lock();
            if (ticket > 0){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ":正在出票:" + (ticket--));
            }
            lock.unlock();
        }
    }
}
