package cn.codeyang.file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by meicai on 2016/2/13
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("io-example" + File.separator + "demo"+ File.separator + "test.txt");

        if (!file.exists()){
            file.createNewFile();
        }

        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.lastModified());

        Date date = new Date(file.lastModified());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String myDate = format.format(date);
        System.out.println(myDate);
    }
}
