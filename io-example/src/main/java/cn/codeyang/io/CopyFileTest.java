package cn.codeyang.io;

import java.io.*;

/**
 * Created by meicai on 2016/2/16
 *
 * 复制文本文件
 * 数据源
 *
 * 目的地
 */
public class CopyFileTest {
    public static void main(String[] args) throws IOException {
        //copyTxtFile();
        //copyImgFile();
        //copyTextFileByByteArray();
        //copyImgFileByByteArray();
        //test01();
        test02();
    }

    /**
     * 字符缓冲流复制文件
     */
    public static void test02() throws IOException {
        File srcFile = new File("io-example" + File.separator +
                "demo" + File.separator + "a.txt");
        File destFile = new File("io-example" + File.separator +
                "demo" + File.separator + "d.txt");

        BufferedReader br = new BufferedReader(new FileReader(srcFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(destFile));

        char[] chs = new char[1024];
        int len = 0;
        while ((len = br.read(chs))!=-1){
            bw.write(new String(chs, 0, len));
        }
        bw.close();
        br.close();
    }

    /**
     * 字符缓冲流复制文件
     */
    public static void test01() throws IOException {
        File srcFile = new File("io-example" + File.separator +
                "demo" + File.separator + "a.txt");
        File destFile = new File("io-example" + File.separator +
                "demo" + File.separator + "c.txt");

        BufferedReader br = new BufferedReader(new FileReader(srcFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(destFile));

        String line = null;
        while ((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }

    private static void copyImgFile(){
        File srcFile = new File("io-example" + File.separator +
                "demo" + File.separator + "1.jpg");
        File destFile = new File("io-example" + File.separator +
                "demo" + File.separator + "2.jpg");
        //封装数据源
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(srcFile);
            outputStream = new FileOutputStream(destFile);

            int b = 0;
            while ((b = inputStream.read()) != -1){
                outputStream.write(b);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void copyImgFileByByteArray(){
        File srcFile = new File("io-example" + File.separator
                + "demo" +File.separator + "1.jpg");
        File destFile = new File("io-example" + File.separator +
                "demo" + File.separator + "3.jpg");

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(srcFile);
            outputStream = new FileOutputStream(destFile);

            byte[] bys = new byte[1024];
            int len;
            while ((len = inputStream.read(bys)) != -1){
                outputStream.write(bys, 0, len);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (outputStream != null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void copyTxtFile() {
        File srcFile = new File("io-example" + File.separator +
                "demo" + File.separator + "a.txt");
        File destFile = new File("io-example" + File.separator +
                "demo" + File.separator + "b.txt");
        //封装数据源
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(srcFile);
            outputStream = new FileOutputStream(destFile);

            int b = 0;
            while ((b = inputStream.read()) != -1){
                outputStream.write(b);
                System.out.print((char)b);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void copyTextFileByByteArray(){
        File srcFile = new File("io-example" + File.separator
                + "demo" +File.separator + "a.txt");
        File destFile = new File("io-example" + File.separator +
                "demo" + File.separator + "c.txt");

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(srcFile);
            outputStream = new FileOutputStream(destFile);

            byte[] bys = new byte[1024];
            int len;
            while ((len = inputStream.read(bys)) != -1){
                outputStream.write(bys, 0, len);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (outputStream != null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
