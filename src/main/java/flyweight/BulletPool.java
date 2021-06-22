package flyweight;

import java.util.ArrayList;
import java.util.List;

public class BulletPool {
    List<Bullet> list = new ArrayList<>();
    {
        for(int i = 0; i < 5; i ++) {
            list.add(new Bullet());
        }
    }

    public Bullet getBullet() {
        for(int i = 0; i < list.size(); i ++) {
            Bullet bullet = list.get(i);
            if(!bullet.living) return bullet;
        }
        return new Bullet();
    }

    public static void main(String[] args) {
        BulletPool bulletPool = new BulletPool();

        for(int i = 0; i < 10; i ++) {
            Bullet bullet = bulletPool.getBullet();
            System.out.println(bullet);
        }
    }
}
