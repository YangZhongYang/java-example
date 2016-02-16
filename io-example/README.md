# File
* 构造方法
    * File(File parent, String child)
    * File(String pathname)
    * File(String parent, String child)
    * File(URI uri)
* File类的功能
    * 创建功能 
        * boolean createNewFile()
        * static File createTempFile(String prefix, String suffix)
        * static File createTempFile(String prefix, String suffix, File directory)
        * boolean mkdir()
        * boolean mkdirs()
    * 删除功能
        * boolean delete()
        * void deleteOnExit();
    * 重命名功能
        * boolean renameTo(File dest)
    * 判断功能
        * boolean canExecute()
        * boolean canRead()
        * boolean canWrite()
        * boolean exists()
        * boolean isDirectory()
        * boolean isFile() 
        * boolean isHidden() 测试此抽象路径名指定的文件是否是一个隐藏文件
    * 基本获取功能
        * String getAbsolutePath() 返回此抽象路径名的绝对路径名字符串
        * String getPath()
        * String getName() 
        * long length() 
        * long lastModified()
    * 高级获取功能
        * String[] list()
        * File[] listFiles()
    * 过滤器功能 
    
# IO
* IO流的分类
    * 流向
        * 输入流 读取数据
        * 输出流 写出数据
    * 数据类型
        * 字节流
            * 字节输入流 读取数据
            * 字节输出流 写出数据
        * 字符流
            * 字符输入流 读取数据
            * 字符输出流 写出数据
    
    
    
# 面试题
* 编译期异常和运行期异常的区别
    * 编译期异常:必须要处理，否则编译不通过
    * 运行期异常:可以不处理，也可以处理
* throw和throws的区别
    * throw:在方法体中，后面跟的是异常对象，并且只能是一个
    * throws:在方法生命上，后面跟的是异常的类，可以是多个，throws是声明方法 有 异常，是一种可能性，这个异常并不一定会产生
* finally关键字
    * finally用于释放资源， 他的代码永远会执行，特殊情况在执行到finally之前jv就退出了
* final, finally, finalize的区别
    * 如果在catch里面有return， 请问finally还执行吗？
* 自定义异常
    * 继承自Exception或RuntimeException,只需要提供无参构造和一个带参构造即可
* 异常的注意事项
    * 父的方法有异常，子的方法在抛出异常的时候必须要小于等于父的异常
    * 父的方法没有异常，子方法不能有异常抛出
    * 父方法抛出多个异常，子方法必须比父少或小