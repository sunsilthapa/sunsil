package LinkedList;

//* time complexity = O(n)

public class StackUsingLinkList {
    public  static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next= null;
        }
    }

    int size=0;
    Node head = null; //?  pointer
    Node tail= null;  //? pointer



    public  void printList(){
        Node current = head;
        while(current!=null){
            System.out.println(current.data );
            current= current.next;
        }
    }


    public int pop(int pos){
        if(head==tail){
           Node temp=head;
           head = tail= null;
           return temp.data;
        }
        Node current = head;
        while(current.next!=tail){
            current=current.next;
        }
        current.next=null;
        Node temp=tail;
        tail= current;
        return temp.data;
    }
}
