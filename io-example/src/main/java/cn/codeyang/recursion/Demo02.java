package cn.codeyang.recursion;

/**
 * Created by meicai on 2016/2/13
 * 不死神兔问题
 */
public class Demo02 {
    public static void main(String[] args) {
        System.out.println(getNum(6));
        System.out.println(getNum2(6));
        System.out.println(getNum3(6));
    }

    /**
     * 递归实现
     * @param num
     * @return
     */
    public static int getNum(int num){
        if (num==1 || num ==2 ){
            return 1;
        }else{
            return getNum(num - 1) + getNum(num - 2);
        }
    }

    /**
     * 数组实现
     * @param num
     * @return
     */
    public static int getNum2(int num){
        int[] arr = new int[num];
        arr[0] = 1;
        arr[1] = 1;

        for (int x = 2; x<arr.length; x++){
            arr[x] = arr[x-1] + arr[x-2];
        }

        return arr[num-1];
    }

    /**
     * 临时变量实现
     * @param num
     * @return
     */
    public static int getNum3(int num){
        int a = 1;
        int b = 1;
        for (int x = 0; x < num-2; x++){
            int temp = a;
            a = b;
            b = temp + a;
        }

        return b;
    }
}
