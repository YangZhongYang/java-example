package cn.codeyang.thread05;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by meicai on 2016/2/22
 */
public class MyThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> ft1 = new FutureTask<Integer>(new MyThread());
        FutureTask<Integer> ft2 = new FutureTask<Integer>(new MyThread());
        new Thread(ft1).start();
        new Thread(ft2).start();
        System.out.println("子线程1的返回值:"+ft1.get());
        System.out.println("子线程2的返回值:"+ft2.get());
    }
}
