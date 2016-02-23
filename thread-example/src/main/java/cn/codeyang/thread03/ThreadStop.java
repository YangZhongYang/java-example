package cn.codeyang.thread03;

import java.util.Date;

/**
 * Created by meicai on 2016/2/21
 */
public class ThreadStop extends Thread{
    @Override
    public void run() {
        System.out.println("线程开始..." + new Date());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("线程被终止了");
        }
        System.out.println("线程结束..." + new Date());
    }
}

