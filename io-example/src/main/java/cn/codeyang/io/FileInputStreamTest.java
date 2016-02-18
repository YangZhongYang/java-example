package cn.codeyang.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by meicai on 2016/2/16
 */
public class FileInputStreamTest {
    public static void main(String[] args) {
        File file = new File("io-example" + File.separator + "demo"
                + File.separator + "test.txt");


        //一次读取一个字节
        //readMethod(file);
        readByteArrayMethod(file);


    }

    /**
     * 一次读取一个字节数组
     * @param file
     */
    private static void readByteArrayMethod(File file){
        FileInputStream input = null;

        try {
            input = new FileInputStream(file);
            /*byte[] bys = new byte[1024];
            int len = input.read(bys);
            System.out.println(len);
            System.out.println(new String(bys));*/

            byte[] bys = new byte[1024];
            int len = 0;
            while ((len = input.read(bys)) != -1){
                System.out.println(new String(bys, 0, len));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (input != null){
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    /**
     * 一次读取一个字节
     * @param file
     */
    private static void readMethod(File file) {
        FileInputStream input = null;
        try {
            input = new FileInputStream(file);

            /*//第一次读取
            int i = input.read();
            System.out.println((char)i);

            //第二次读取
            i = input.read();
            System.out.println((char)i);

            //第三次读取
            i = input.read();
            System.out.println((char)i);*/

            //用循环改进
            /*int i = input.read();
            while (i != -1){
                System.out.print((char)i);
                i = input.read();
            }*/

            //最终版
            int i = 0;
            while ((i = input.read()) != -1){
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (input != null){
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
