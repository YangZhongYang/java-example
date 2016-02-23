package cn.codeyang.面试题.demo01;

/**
 * Created by meicai on 2016/2/22
 */
public class Cave {
    private Person person;

    public synchronized void pass(Person person){
        this.person = person;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(person.getName() + "通过...");
    }
}
