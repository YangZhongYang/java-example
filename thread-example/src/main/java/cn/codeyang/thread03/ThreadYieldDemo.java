package cn.codeyang.thread03;

/**
 * Created by meicai on 2016/2/21
 */
public class ThreadYieldDemo {
    public static void main(String[] args) {
        ThreadYield ty1 = new ThreadYield();
        ThreadYield ty2 = new ThreadYield();
        ty1.setName("阿宝");
        ty2.setName("阿飞");

        ty1.start();
        ty2.start();
    }
}
