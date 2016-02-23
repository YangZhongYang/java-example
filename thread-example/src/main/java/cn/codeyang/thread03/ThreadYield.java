package cn.codeyang.thread03;

/**
 * Created by meicai on 2016/2/21
 */
public class ThreadYield extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
            Thread.yield();
        }
    }
}
