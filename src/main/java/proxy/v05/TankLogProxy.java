package proxy.v05;

public class TankLogProxy implements Movable {
    Tank tank;
    @Override
    public void move() {
        System.out.println("start moving...");
        tank.move();
        System.out.println("stopped!");
    }

    public TankLogProxy(Tank tank) {
        this.tank = tank;
    }
}
