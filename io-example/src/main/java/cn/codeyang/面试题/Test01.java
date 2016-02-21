package cn.codeyang.面试题;

import java.io.*;

/**
 * 下列程序将从file1.dat文件中读取全部数据，然后写到file2.dat文件中
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        //demo01();
        //demo02();
        demo03();
    }

    private static void demo03() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("io-example/demo/file1.dat"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("io-example/demo/file2.dat"));

        String line;
        while ((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        bw.close();
        br.close();
    }

    private static void demo02() throws IOException {
        FileReader fr = new FileReader("io-example/demo/file1.dat");
        FileWriter fw = new FileWriter("io-example/demo/file2.dat");

        char[] c = new char[1024];
        int len = 0;
        while ((len = fr.read(c)) != -1){
                fw.write(c, 0, len);
        }

        fw.close();
        fr.close();

    }

    private static void demo01() throws IOException {
        FileInputStream fis = new FileInputStream("io-example/demo/file1.dat");
        FileOutputStream fos = new FileOutputStream("io-example/demo/file2.dat");

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = fis.read(bys)) != -1){
            fos.write(bys, 0, len);
        }

        fos.close();
        fis.close();
    }
}
