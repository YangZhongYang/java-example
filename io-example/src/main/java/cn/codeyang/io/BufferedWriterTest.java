package cn.codeyang.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by meicai on 2016/2/18
 */
public class BufferedWriterTest {
    public static void main(String[] args) throws IOException {
        File file = new File("io-example" + File.separator +
                "demo" + File.separator + "test.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

        for (int i = 0; i < 10; i++) {
            bw.write("helloworld");
            bw.newLine();
            bw.flush();
        }

        bw.close();
    }
}
