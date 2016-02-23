package cn.codeyang.生产者消费者问题;

/**
 * Created by meicai on 2016/2/21
 */
public class SetStudent extends Thread {

    Student student;
    private int x = 0;

    public SetStudent(Student student){
        this.student = student;
    }

    @Override
    public void run() {
        while (true){
            synchronized (student){
                if (student.isFlag()){
                    try {
                        student.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (x % 2 == 0){
                    student.setName("张三");
                    student.setAge(10);
                }else{
                    student.setName("李四");
                    student.setAge(4);
                }
                x++;

                student.setFlag(true);
                student.notify();
            }
        }
    }
}
