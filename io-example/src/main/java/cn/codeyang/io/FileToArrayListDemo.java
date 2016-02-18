package cn.codeyang.io;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by meicai on 2016/2/18
 */
public class FileToArrayListDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("io-example" + File.separator +
                "demo" + File.separator + "arrayList.txt");

        ArrayList<String> list = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = null;
        while ((line = br.readLine()) != null){
            list.add(line);
        }

        br.close();

        for (String s : list) {
            System.out.println(s);
        }

    }
}
