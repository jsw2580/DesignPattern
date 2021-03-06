package strategy;

public class DogComparator implements Comparator<Dog> {

    @Override
    public int compare(Dog t1, Dog t2) {
        if(t1.food > t2.food) return 1;
        else if(t1.food < t2.food) return -1;
        else return 0;
    }
}
