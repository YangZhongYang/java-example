package cn.codeyang.file;

import java.io.File;
import java.io.IOException;

/**
 * Created by meicai on 2016/2/12
 */
public class Constructor {
    public static void main(String[] args) throws IOException {
        File file = new File("d:" + File.separator + "a.txt");
        System.out.println(file.mkdir());

        File file2 = new File("d:" + File.separator + "b.txt");
        try {
            System.out.println(file2.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file3 = new File("d:" + File.separator + "b.txt");
        System.out.println(file3.getCanonicalFile());
        System.out.println(file3.getCanonicalPath());
        System.out.println(file3.getAbsoluteFile());
        System.out.println(file3.getAbsolutePath());
        System.out.println(file3.getFreeSpace());
        System.out.println(file3.getName());
        System.out.println(file3.getParent());
        System.out.println(file3.getParentFile());
    }
}
