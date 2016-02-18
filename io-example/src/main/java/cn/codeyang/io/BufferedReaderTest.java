package cn.codeyang.io;

import java.io.*;

/**
 * Created by meicai on 2016/2/18
 */
public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {
        //test01();
        test02();
    }

    private static void test02() throws IOException {
        File file = new File("io-example" + File.separator +
                "demo" + File.separator + "test.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        char[] chs = new char[1024];
        int len = 0;
        while ((len = br.read(chs)) != -1){
            System.out.println(new String(chs, 0, len));
        }

    }

    private static void test01() throws IOException {
        File file = new File("io-example" + File.separator +
                "demo" + File.separator + "test.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = null;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }

        br.close();
    }
}
