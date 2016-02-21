package cn.codeyang.thread03;

/**
 * Created by meicai on 2016/2/19
 */
public class ThreadDaemon extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
        }
    }
}
