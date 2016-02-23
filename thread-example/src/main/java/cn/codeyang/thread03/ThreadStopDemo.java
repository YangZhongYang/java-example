package cn.codeyang.thread03;

/**
 * Created by meicai on 2016/2/21
 */
public class ThreadStopDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadStop ts = new ThreadStop();
        ts.start();
        Thread.sleep(500);
        ts.interrupt();
    }
}
