package cn.codeyang.面试题.demo02;

/**
 * Created by meicai on 2016/2/22
 */
public class EnvScan implements Runnable {
    private Environment env;

    public EnvScan(Environment env) {
        this.env = env;
    }

    public void run() {
        synchronized (env){
            for (int i=0; i<100; i++){
                if (i % 2 == 0) {
                    try {
                        Thread.sleep(5000);
                        Thread.yield();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    env.setFengsu(1);
                    env.setShidu(1);
                    env.setWendu(1);
                    System.out.println(env.isFlag());
                    System.out.println("设置了数据");
                    System.out.println(env.isFlag());
                } else {
                    try {
                        Thread.sleep(5000);
                        Thread.yield();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    env.setFengsu(2);
                    env.setShidu(2);
                    env.setWendu(2);
                    System.out.println(env.isFlag());
                    System.out.println("设置了数据");
                    System.out.println(env.isFlag());
                }
                env.setFlag(true);
            }
        }
    }
}
