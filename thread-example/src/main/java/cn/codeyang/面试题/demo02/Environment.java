package cn.codeyang.面试题.demo02;

/**
 * Created by meicai on 2016/2/22
 */
public class Environment {
    private int shidu;
    private int wendu;
    private int fengsu;
    private boolean flag;

    public int getShidu() {
        return shidu;
    }

    public void setShidu(int shidu) {
        this.shidu = shidu;
    }

    public int getWendu() {
        return wendu;
    }

    public void setWendu(int wendu) {
        this.wendu = wendu;
    }

    public int getFengsu() {
        return fengsu;
    }

    public void setFengsu(int fengsu) {
        this.fengsu = fengsu;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Environment{" +
                "shidu=" + shidu +
                ", wendu=" + wendu +
                ", fengsu=" + fengsu +
                ", flag=" + flag +
                '}';
    }
}
