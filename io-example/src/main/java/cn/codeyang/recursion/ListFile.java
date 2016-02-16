package cn.codeyang.recursion;

import java.io.File;

/**
 * Created by meicai on 2016/2/13
 */
public class ListFile {
    public static void main(String[] args) {
        //File srcFolder = new File("e:" + File.separator + "resource");
        File srcFolder = new File("d:");
        //getAllJavaFile(srcFolder);
        getAllFile(srcFolder);
    }

    public static void getAllJavaFile(File srcFolder) {
        //获取该目录下所有的文件或者文件夹的File数组
        File[] files = srcFolder.listFiles();

        //遍历该File数组，得到每一个File对象
        for (File file : files) {
            if (file.isDirectory()) {
                getAllJavaFile(file);
            } else {
                if (file.getName().endsWith(".java")){
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }

    public static void getAllFile(File srcFolder){
        File[] files = srcFolder.listFiles();

        for (int i = 0; i < files.length; i++){
            if (files[i].isDirectory()){
                getAllFile(files[i]);
            }else{
                System.out.println(files[i].getAbsolutePath());
            }
        }
    }
}
