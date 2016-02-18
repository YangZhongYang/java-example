package cn.codeyang.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Created by meicai on 2016/2/16
 */
public class OutputStreamWriterTest {
    public static void main(String[] args) throws IOException {
        File file = new File("io-example" + File.separator +
                "demo" + File.separator + "test.txt");
        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
        //writer.write(97);

        //写字符数组
        /*char[] chs = {'a', 'b', 'c'};
        writer.write(chs);*/


        //writer.write("你好，hello");

        writer.flush();
        writer.close();

    }
}
