package cn.codeyang.生产者消费者问题;

/**
 * Created by meicai on 2016/2/21
 */
public class GetStudent extends Thread {
    Student student;

    public GetStudent(Student student){
        this.student = student;
    }

    @Override
    public void run() {
        while (true){
            synchronized (student){
                if (!student.isFlag()){
                    try {
                       student.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(student.getName() + "-----" + student.getAge());


                student.setFlag(false);
                student.notify();
            }
        }
    }
}
