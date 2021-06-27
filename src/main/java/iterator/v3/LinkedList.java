package iterator.v3;

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
        private Object object;
        Node next;

        public Node(Object object) {
            this.object = object;
        }
    }

}
