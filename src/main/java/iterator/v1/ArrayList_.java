package iterator.v1;

public class ArrayList_ {
    Object[] objects = new Object[10];
    private int index = 0;

    public void add(Object o) {
        if(index == objects.length) {
            Object[] newObjects = new Object[index * 2];
            System.arraycopy(objects, 0, newObjects, 0, index);
            objects = newObjects;
        }

        objects[index] = o;
        index ++;
    }

    public int size() {
        return index;
    }
}
