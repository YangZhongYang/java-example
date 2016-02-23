package cn.codeyang.面试题.demo02;

/**
 * Created by meicai on 2016/2/22
 */
public class Computer implements Runnable {
    private Environment env;

    public Computer(Environment env) {
        this.env = env;
    }

    public void run() {
        synchronized (env) {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(env);
            }
        }
    }
}
