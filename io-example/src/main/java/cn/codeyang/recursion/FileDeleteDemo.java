package cn.codeyang.recursion;

import java.io.File;

/**
 * Created by meicai on 2016/2/14
 *
 * 递归删除带内容的目录
 *
 * A：封装目录
 * B：获取该目录下的所有文件或文件夹的File数组
 * C：便利该File数组，得到每一个File对象
 * D：判断该File对象是否是文件夹
 *      是：回到B
 *      否：就删除
 */
public class FileDeleteDemo {
    public static void main(String[] args) {
        File srcFolder = new File("io-example" + File.separator + "demo");

        deleteFolder(srcFolder);
    }

    private static void deleteFolder(File srcFolder) {
        File[] fileArray = srcFolder.listFiles();

        for (File file : fileArray) {
            if (file.isDirectory()){
                deleteFolder(file);
            }else{
                System.out.println(file.getName() + "---" + file.delete());
            }
        }

        //删除文件夹
        System.out.println("srcFolder:" + srcFolder.delete());
    }


}
