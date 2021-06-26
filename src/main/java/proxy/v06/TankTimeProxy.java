package proxy.v06;

public class TankTimeProxy implements Movable {

    Movable movable;
    @Override
    public void move() {
        long start = System.currentTimeMillis();
        movable.move();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public TankTimeProxy(Movable movable) {
        this.movable = movable;
    }
}
