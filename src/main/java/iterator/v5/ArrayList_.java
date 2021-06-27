package iterator.v5;

public class ArrayList_<E> implements Collection_<E> {

    E[] objects = (E[]) new Object[10];
    private int index = 0;

    @Override
    public void add(E object) {
        if(index == objects.length) {
            E[] newObjects = (E[]) new Object[index * 2];
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

    @Override
    public Iterator_ iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator_ {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            if(currentIndex >= index) {
                return false;
            }
            return true;
        }

        @Override
        public E next() {
            E o = objects[currentIndex];
            currentIndex ++;
            return o;
        }
    }
}
