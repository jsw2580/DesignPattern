package strategy;

public class Dog implements Comparable<Dog> {
    int food;

    @Override
    public int compareTo(Dog o) {
        Dog dog = (Dog) o;
        if(this.food < dog.food) return -1;
        else if(this.food > dog.food) return 1;
        else return 0;
    }

    public Dog(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}
