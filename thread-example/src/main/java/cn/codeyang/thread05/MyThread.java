package cn.codeyang.thread05;

import java.util.concurrent.Callable;

/**
 * Created by meicai on 2016/2/22
 */
public class MyThread implements Callable<Integer> {
    public Integer call() throws Exception {
        int i=0;
        for (; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            Thread.sleep(100);
        }
        return  i;
    }
}
