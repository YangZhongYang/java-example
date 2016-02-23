package cn.codeyang.thread03;

/**
 * Created by meicai on 2016/2/21
 */
public class ThreadSleepDemo {
    public static void main(String[] args) {
        ThreadSleep ts1 = new ThreadSleep();
        ThreadSleep ts2 = new ThreadSleep();
        ThreadSleep ts3 = new ThreadSleep();

        ts1.start();
        ts2.start();
        ts3.start();
    }
}
