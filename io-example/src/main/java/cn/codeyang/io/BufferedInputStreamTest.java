package cn.codeyang.io;

import java.io.*;

/**
 * Created by meicai on 2016/2/16
 */
public class BufferedInputStreamTest {
    public static void main(String[] args) {
        File file = new File("io-example" + File.separator +
                        "demo" + File.separator + "test.txt");

        BufferedInputStream bin = null;
        try {
            bin = new BufferedInputStream(new FileInputStream(file));
            byte[] bys = new byte[1024];
            int len = 0;
            while ((len = bin.read(bys)) != -1){
                System.out.print(new String(bys, 0, len));
            }
            /*int by = 0;
            while ((by = bin.read()) != -1){
                System.out.print((char)by);
            }*/

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bin != null){
                try {
                    bin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
