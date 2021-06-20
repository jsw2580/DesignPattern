package Singleton;
//跟第一种一样
public class Mgr02 {

    private static final Mgr02 INSTANCE;

    static {
        INSTANCE = new Mgr02();
    }

    private Mgr02() {};

    public static Mgr02 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Mgr02 m1 = new Mgr02();
        Mgr02 m2 = new Mgr02();
        System.out.println(m1 == m2);
    }
}
