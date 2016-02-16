package cn.codeyang.file;

import java.io.File;

/**
 * Created by meicai on 2016/2/13
 */
public class FileDemo02 {
    public static void main(String[] args) {
        File file = new File("d:" + File.separator);

        String[] strArray = file.list();
        for (String s : strArray) {
            System.out.println(s);
        }

        System.out.println("-------");

        File[] fileArray = file.listFiles();
        for (File f : fileArray){
            System.out.println(f.getName());
        }
    }
}
