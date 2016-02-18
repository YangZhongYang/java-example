package cn.codeyang.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by meicai on 2016/2/16
 */
public class FileOutputStreamTest {
    public static void main(String[] args) {
        File file = new File("io-example" + File.separator +
                "demo" + File.separator + "test.txt");

        FileOutputStream out = null;
        try {
            out = new FileOutputStream(file, true);
            out.write("hello".getBytes());
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (out != null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
