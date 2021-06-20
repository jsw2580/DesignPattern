package Singleton;
//懒汉式 加锁 线程安全 效率降低
public class Mgr04 {

    private static Mgr04 INSTANCE;

    private Mgr04() {};

    public static synchronized Mgr04 getInstance() {
        if(INSTANCE == null) {
            try {
                Thread.sleep(1);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            INSTANCE = new Mgr04();
        }

        return INSTANCE;
    }

    public static void main(String[] args) {
        for(int i = 0; i < 100; i ++) {
            new Thread(() -> {
                System.out.println(Mgr04.getInstance().hashCode());
            }).start();
        }
    }
}
