package cn.codeyang.面试题;

import java.io.*;

/**
 * 将一个GBK编码的文本文件转存为一个UTF-8编码的文本文件
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("io-example/demo/gbk.txt"), "gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("io-example/demo/utf8.txt"), "utf-8");

        char[] chs = new char[1024];
        int len = 0;
        while ((len = isr.read(chs)) != -1){
            osw.write(chs, 0, len);
        }

        osw.close();
        isr.close();
    }
}
