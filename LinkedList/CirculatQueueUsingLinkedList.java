package LinkedList;

import java.util.LinkedList;

public class CirculatQueueUsingLinkedList {
    private LinkedList<Integer> queue;
    private int size;

    public CirculatQueueUsingLinkedList(int size) {
        queue = new LinkedList<>();
        this.size = size;
    }

    public void enqueue(int element) {
        if (queue.size() == size) {
            queue.removeFirst();
        }
        queue.addLast(element);
    }

    public int dequeue() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.removeFirst();
    }

    public int peek() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.getFirst();
    }

    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public boolean isFull() {
        return queue.size() == size;
    }

    public static void main(String[] args) {
        CirculatQueueUsingLinkedList queue = new CirculatQueueUsingLinkedList(3);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(" ");

        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);

        System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
    }
}