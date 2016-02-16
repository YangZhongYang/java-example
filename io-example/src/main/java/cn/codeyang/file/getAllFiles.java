package cn.codeyang.file;

import java.io.File;

/**
 * Created by meicai on 2016/2/13
 */
public class getAllFiles {
    public static void main(String[] args) {
        File file = new File("d:" + File.separator);
        printFile(file);
    }

    public static void printFile(File file){
        File[] fileArray = file.listFiles();

        for (File f : fileArray) {
            if (f.isDirectory()){
                printFile(f);
            }else if (f.isFile()){
                System.out.println(f);
            }
        }
    }
}
