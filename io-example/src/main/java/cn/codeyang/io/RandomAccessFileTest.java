package cn.codeyang.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by meicai on 2016/2/19
 */
public class RandomAccessFileTest{
    public static void main(String[] args) throws IOException {
        //write();
        //read();
        append();
    }

    /**
     * 向文件中追加内容
     */
    private static void append() throws IOException {
        RandomAccessFile raf = new RandomAccessFile("io-example/demo/raf.txt", "rw");
        raf.seek(raf.length());

        raf.write("我是最佳的\r\n".getBytes());
        raf.close();
    }

    private static void read() throws IOException {
        RandomAccessFile raf = new RandomAccessFile("io-example/demo/raf.txt", "rw");
        System.out.println("当前的指针位置是：" + raf.getFilePointer());

        raf.seek(10);
        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = raf.read(bys)) != -1){
            System.out.println(new String(bys, 0, len));
        }
        raf.close();

    }

    private static void write() throws IOException {
        RandomAccessFile raf = new RandomAccessFile("io-example/demo/raf.txt", "rw");
        raf.writeInt(1);
        raf.writeChars("hello");
        raf.close();
    }
}
