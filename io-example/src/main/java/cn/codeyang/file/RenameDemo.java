package cn.codeyang.file;

import java.io.File;

/**
 * Created by meicai on 2016/2/13
 *
 * 批量修改文件名
 */
public class RenameDemo {
    public static void main(String[] args) {
        //封装目录
        File srcFolder = new File("d:" + File.separator + "demo");

        //获取该目录下的所有File数组
        File[] fileArray = srcFolder.listFiles();

        //遍历该师数组， 得到每一个File对象
        for (File file : fileArray) {
            String name = file.getName();
            int startIndex = name.indexOf("(");
            int endIndex = name.lastIndexOf(")");
            String subname = name.substring(startIndex + 1, endIndex);

            String suffix = name.substring(name.lastIndexOf(".") + 1);
            String newName = subname.concat(".").concat(suffix);

            File newFile = new File(srcFolder, newName);
            file.renameTo(newFile);
        }
    }
}
