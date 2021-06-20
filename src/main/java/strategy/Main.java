package strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] a = {9, 2, 3, 5, 7, 1, 4};
        Cat[] cats = {new Cat(3, 3), new Cat(5, 5), new Cat(1, 1)};
//        Dog[] dogs = {new Dog(3), new Dog(5), new Dog(1)};
        Sorter<Cat> sorter = new Sorter<>();
        sorter.sort(cats, (t1, t2) -> {
            if(t1.height > t2.height) return 1;
            else if(t1.height < t2.height) return -1;
            else return 0;
        });
        System.out.println(Arrays.toString(cats));
    }
}
