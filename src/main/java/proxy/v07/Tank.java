package proxy.v07;

import proxy.v06.TankLogProxy;
import proxy.v06.TankTimeProxy;

import java.lang.reflect.Proxy;
import java.util.Random;

public class Tank implements Movable {

    @Override
    public void move() {
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Tank tank = new Tank();

        Movable movable = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[] {Movable.class},
                new LogHandr(tank));

        movable.move();
    }
}
