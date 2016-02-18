package cn.codeyang.io;

import java.io.*;

/**
 * Created by meicai on 2016/2/16
 */
public class BufferedOutputStreamTest {
    public static void main(String[] args) {
        File file = new File("io-example" + File.separator +
                        "demo" + File.separator + "test.txt");
        FileOutputStream ops = null;
        try {
            ops = new FileOutputStream(file);
            BufferedOutputStream bops = new BufferedOutputStream(ops);
            bops.write("hello你好".getBytes());
            bops.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (ops != null){
                try {
                    ops.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
