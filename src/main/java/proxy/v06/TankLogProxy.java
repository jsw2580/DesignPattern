package proxy.v06;

public class TankLogProxy implements Movable {
    Movable movable;
    @Override
    public void move() {
        System.out.println("start moving...");
        movable.move();
        System.out.println("stopped!");
    }

    public TankLogProxy(Movable movable) {
        this.movable = movable;
    }
}
