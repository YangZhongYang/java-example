package cn.codeyang.file;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by meicai on 2016/2/13
 *
 * 使用文件名称过滤器输出指定目录下指定后缀名对的文件名称案例
 */
public class FileNameFilterDemo {
    public static void main(String[] args) {
        File file = new File("d:" + File.separator);

        String[] strArray = file.list(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return new File(dir, name).isFile() && name.endsWith(".txt");
            }
        });

        for (String s : strArray) {
            System.out.println(s);
        }
    }
}
