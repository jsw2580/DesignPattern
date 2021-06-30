package prototype.v1;

public class Person implements Cloneable {
    int score = 100;
    int age = 8;
    Location location = new Location("bj", 22);

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
