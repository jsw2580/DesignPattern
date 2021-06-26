package proxy.v04;

public class TankTimeProxy implements Movable {

    Tank tank;
    @Override
    public void move() {
        long start = System.currentTimeMillis();
        tank.move();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public TankTimeProxy(Tank tank) {
        this.tank = tank;
    }
}
