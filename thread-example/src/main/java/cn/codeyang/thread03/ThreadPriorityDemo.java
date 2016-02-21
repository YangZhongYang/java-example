package cn.codeyang.thread03;

/**
 * Created by meicai on 2016/2/19
 */
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        ThreadPriority tp1 = new ThreadPriority();
        ThreadPriority tp2 = new ThreadPriority();
        ThreadPriority tp3 = new ThreadPriority();

        tp1.setName("东方不败");
        tp2.setName("岳不群");
        tp3.setName("林平之");

        tp1.setPriority(10);
        tp2.setPriority(1);

        tp1.start();
        tp2.start();
        tp3.start();
    }
}
