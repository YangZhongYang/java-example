package cn.codeyang.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by meicai on 2016/2/18
 */
public class ArrayListToFileDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");

        File file = new File("io-example" + File.separator +
                "demo" + File.separator + "arrayList.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
            bw.flush();
        }

        bw.close();
    }
}
