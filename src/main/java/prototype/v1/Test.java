package prototype.v1;

public class Test {
    public static void main(String[] args) throws Exception {
        Person person1 = new Person();
        Person person2 = (Person) person1.clone();
        System.out.println(person2.age + " " + person2.score);
        System.out.println(person2.location);

        System.out.println(person1.location == person2.location);
        person1.location.street = "sh";
        System.out.println(person2.location);
    }
}
