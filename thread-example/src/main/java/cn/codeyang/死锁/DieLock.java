package cn.codeyang.死锁;

/**
 * Created by meicai on 2016/2/21
 */
public class DieLock implements Runnable {

    boolean flag;

    public DieLock(boolean flag) {
        this.flag = flag;
    }

    private static Object objA = new Object();
    private static Object objB = new Object();

    public void run() {
        if (flag){
            synchronized (objA){
                System.out.println("objA");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (objB){
                    System.out.println("objB");
                }
            }
        }else {
            synchronized (objB){
                System.out.println("eobjA");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (objA){
                    System.out.println("eobjB");
                }
            }
        }
    }
}
