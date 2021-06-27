package iterator.v1;

public class Main {
    public static void main(String[] args) {
        ArrayList_ arrayList = new ArrayList_();
        for(int i = 0; i < 15; i ++) {
            arrayList.add(new String("s" + i));
        }
        System.out.println(arrayList.size());
    }
}
