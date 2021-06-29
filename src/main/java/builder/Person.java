package builder;

public class Person {
    int id;
    String name;
    int age;
    double weight;
    int score;
    Location location;

    private Person() {}

    public static class PersonBuilder {
        Person person = new Person();

        public PersonBuilder basicInfo(int id, String name, int age) {
            person.id = id;
            person.name = name;
            person.age = age;
            return this;
        }

        public PersonBuilder weight(double weight) {
            person.weight = weight;
            return this;
        }

        public PersonBuilder score(int score) {
            person.score = score;
            return this;
        }

        public PersonBuilder loc(String street, String roomNo) {
            person.location = new Location(street, roomNo);
            return this;
        }

        public Person build() {
            return person;
        }
    }
}
