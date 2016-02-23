package cn.codeyang.thread03;

/**
 * Created by meicai on 2016/2/19
 */
public class ThreadJoinDemo {
    public static void main(String[] args) {
        ThreadJoin tj1 = new ThreadJoin();
        ThreadJoin tj2 = new ThreadJoin();
        ThreadJoin tj3 = new ThreadJoin();

        tj1.start();

        try {
            tj1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tj2.start();
        try {
            tj2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tj3.start();
        try {
            tj3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
