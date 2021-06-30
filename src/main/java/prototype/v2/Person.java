package prototype.v2;

public class Person implements Cloneable {
    int score = 100;
    int age = 8;
    Location location = new Location("bj", 22);

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        person.location = (Location) location.clone();
        return person;
    }
}
