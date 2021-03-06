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
    * 字节流
        * FileOutputStream
            * 文件是否可用或能否可以被创建取决于基础平台。特别是某些平台一次只允许一个 FileOutputStream（或其他文件写入对象）打开文件进行写入
            * FileOutputStream(File file)
            * FileOutputStream(String name) 
            * 创建字节输出流对象做了几件事情
                * 调用系统功能去创建文件
                * 创建对象
                * 把直接输出流对象指向这个文件
        * FileInputStream
            * FileInputStream(File file) 
            * FileInputStream(String name) 
            * 读取的方式
                * read() 一次读取一个字节
                * read(byte[] b) 一次读取一个字节数组
        * 在计算机中中文的存储分为两个字节
            * 第一个字节是负数
            * 第二个字节常见的是负数， 可能有正数， 不影响
        * 字节流复制文本文件
            * 复制中文不会出现乱码
            * 在控制台输出会出现乱码
        * 缓冲字节流
            * BufferedInputStream
            * BufferedOutputStream
    * 字符流
        * Writer
            * OutputStreamWriter
                * 写数据的5种方式
                    * writer(int c); 写一个字符
                    * writer(char[] cbuf); 写一个字符数组
                    * writer(char[] cbuf, int off, int len); 写一个字符数组的一部分
                    * writer(String str, int off, int len); 写一个字字符串的一部分
        * Reader
            * InputStreamReader
                * InputStreamReader读取数据的两种方式
                    * read()
                    * read(char[] chs)
    
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