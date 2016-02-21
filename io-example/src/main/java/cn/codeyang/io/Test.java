package cn.codeyang.io;

import java.io.*;
import java.util.Arrays;

/**
 * Created by meicai on 2016/2/18
 */
public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("io-example" + File.separator +
                "demo" + File.separator + "test.txt");

        int[] array = {1, 2, 3};
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
        DataInputStream dis = new DataInputStream(new FileInputStream(file));

        for (int i : array) {
            dos.writeInt(i);
        }

        for (int i = array.length-1; i>=0; i--){
            array[i] = dis.readInt();
        }

        for (int i : array) {
            System.out.println(i);
        }
    }
}
