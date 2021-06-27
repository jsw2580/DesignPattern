package iterator.v3;

public class ArrayList_ implements Collection_ {

    Object[] objects = new Object[10];
    private int index = 0;

    @Override
    public void add(Object object) {
        if(index == objects.length) {
            Object[] newObjects = new Object[index * 2];
            System.arraycopy(objects, 0, newObjects, 0, index);
            objects = newObjects;
        }

        objects[index] = object;
        index ++;
    }

    @Override
    public int size() {
        return index;
    }
}
