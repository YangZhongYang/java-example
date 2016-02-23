package cn.codeyang.thread04;

/**
 * Created by meicai on 2016/2/21
 */
public class SellTicket implements Runnable{
    private static int ticket = 100;


    public void run() {
        while (true){
            synchronized (this){
                if (ticket > 0){
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出票..." + (ticket--) + "张票");
                }
            }

        }
    }
}
