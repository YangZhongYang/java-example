package cn.codeyang.recursion;

/**
 * Created by meicai on 2016/2/13
 * 实现5的阶层
 */
public class Demo01 {
    public static void main(String[] args) {
        System.out.println(getSum(5));
    }

    public static int getStore(int num){
        if (num == 1){
            return 1;
        }else {
            return num *= getStore(num-1);
        }
    }

    public static int getSum(int num){
        if (num == 1){
            return 1;
        }else {
            return num += getSum(num - 1);
        }
    }
}
