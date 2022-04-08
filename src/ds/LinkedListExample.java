package ds;

import java.util.LinkedList;

public class LinkedListExample {
    private final static class MyLinkedList<E> {
        private final class Node<E> {
            private Node<E> prev, next;
            private E e;

            public Node(E e) {
                this.e = e;
            }
        }

        private Node<E> head;
        private Node<E> tail;
        public void add (E e) {

            if (head == null) {
                head = tail = new Node<>(e);
            } else {

                Node<E> node = new Node<>(e);
                node.prev = tail;
                tail.next = node;
                tail = node;
            }
        }
    }
    public static void main(String[] args) {

        LinkedList<Integer> queue = new LinkedList<>();
    }
}
