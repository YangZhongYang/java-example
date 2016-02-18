package cn.codeyang.io;

import java.io.*;

/**
 * Created by meicai on 2016/2/16
 */
public class InputStreamReaderTest {
    public static void main(String[] args) throws IOException {
        //readByCharArray();
        read();

    }

    private static void read() throws IOException {
        File file = new File("io-example" + File.separator +
                "demo" + File.separator + "test.txt");

        InputStreamReader reader = new InputStreamReader(new FileInputStream(file), "UTF-8");

        int ch = 0;
        while ((ch = reader.read()) != -1){
            System.out.print((char)ch);
        }

        reader.close();
    }

    private static void readByCharArray() throws IOException {
        File file = new File("io-example" + File.separator +
                "demo" + File.separator + "test.txt");

        InputStreamReader reader = new InputStreamReader(new FileInputStream(file), "UTF-8");
        char[] chs = new char[1024];
        int len = 0;
        while ((len = reader.read(chs)) != -1){
            System.out.print(new String(chs, 0, len));
        }

        reader.close();
    }
}
