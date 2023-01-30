package LinkedList;

import Graph.SinglyLInkedList;

public class TestList {
    public static void main(String[] args) {
        SinglyLInkedList list1 = new SinglyLInkedList();
        list1.addNodeLast(10);
        list1.addNodeLast(20);
        list1.addNodeLast(30);

        System.out.println("Before removing");
        System.out.println("After removing");
        list1.printList();


    }
}
