package cn.codeyang.面试题;

import java.io.*;

/**
 * 序列化流
 */
public class 序列化 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //writeObject();
        readObject();
    }

    private static void readObject() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("io-example/demo/oos.txt"));
        Cat cat = (Cat) ois.readObject();
        System.out.println("name:" + cat.getName() + " age:" + cat.getAge());
    }

    private static void writeObject() throws IOException {
        Cat cat = new Cat();
        cat.setName("Tom");
        cat.setAge(2);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("io-example/demo/oos.txt"));
        oos.writeObject(cat);
        oos.close();
    }
}
