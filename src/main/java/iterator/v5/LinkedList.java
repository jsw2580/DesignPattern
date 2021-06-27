package iterator.v5;

public class LinkedList<E> implements Collection_<E> {

    Node head = null;
    Node tail = null;
    private int size = 0;

    @Override
    public void add(E object) {
        Node node = new Node(object);
        node.next = null;

        if(head == null) {
            head = node;
            tail = node;
        }

        tail.next = node;
        tail = tail.next;
        size ++;
    }

    @Override
    public int size() {
        return size;
    }

    private class Node {
        private E object;
        Node next;

        public Node(E object) {
            this.object = object;
        }
    }

    @Override
    public Iterator_ iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator_ {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            if(currentIndex >= size) {
                return false;
            }
            return true;
        }

        @Override
        public E next() {
            Node node = head;
            for(int i = 0; i < currentIndex; i ++) {
                if(node.next == null) {
                    return null;
                }
                node = node.next;
            }
            currentIndex ++;
            return node.object;
        }
    }
}
