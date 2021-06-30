package prototype.v4;

public class Test {
    public static void main(String[] args) throws Exception {
        Person person1 = new Person();
        Person person2 = (Person) person1.clone();
        System.out.println("person1.location == person.location ? " + (person1.location == person2.location));
        
        person1.location.street.reverse();
        System.out.println(person2.location.street);
    }
}
