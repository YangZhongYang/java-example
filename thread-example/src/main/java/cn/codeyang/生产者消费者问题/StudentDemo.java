package cn.codeyang.生产者消费者问题;

/**
 * Created by meicai on 2016/2/21
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student stu = new Student();
        SetStudent setStudent = new SetStudent(stu);
        GetStudent getStudent = new GetStudent(stu);

        getStudent.start();
        setStudent.start();
    }
}
