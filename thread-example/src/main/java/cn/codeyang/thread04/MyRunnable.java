package cn.codeyang.thread04;

/**
 * Created by meicai on 2016/2/21
 */
public class MyRunnable implements Runnable {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
