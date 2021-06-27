package iterator.v4;

public class LinkedList implements Collection_ {

    Node head = null;
    Node tail = null;
    private int size = 0;

    @Override
    public void add(Object object) {
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
        private String object;
        Node next;

        public Node(Object object) {
            this.object = (String) object;
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
        public String next() {
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
