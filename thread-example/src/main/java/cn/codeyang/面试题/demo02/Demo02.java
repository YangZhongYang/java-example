package cn.codeyang.面试题.demo02;

/**
 * Created by meicai on 2016/2/22
 */
public class Demo02 {
    public static void main(String[] args) {
        Environment env = new Environment();

        EnvScan es = new EnvScan(env);
        Computer c = new Computer(env);

        Thread t1 = new Thread(es);
        Thread t2 = new Thread(c);

        t1.start();
        t2.start();
    }
}
