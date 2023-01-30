package LinkedList;

public class DoublyLinkedList {
    public  static  class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data= data;
            this.next=this.prev=null;
        }
    }

    Node head = null;
    Node tail= null;
    public void addNode(int data){
        Node newNode = new Node(data);
        //? first time data insert
        if(head==null){
            head=tail=newNode;
        }
        //? already have some node
        tail.next=newNode;
        newNode.prev=tail;
        tail =newNode;
    }

    public int getDataAtAnyPos(int pos){
        Node current = head;
        for(int i=1; i<pos; i++){
            current= current.next;
        }
        return  current.data;
    }

    public void insertDataAtAnyPosition(int data, int pos){
        Node newNode = new Node(data);
        //? insert data at first positon
        if(pos==0){
            head.prev=newNode;
            newNode.next=head;
            head=newNode;
        }
        //? insert data at other position
        Node current = head;
        for(int i=1; i<pos; i++){
            current = current.next;
        }
        Node temp = current.next;
        current.next=newNode;
        newNode.prev=current;

        temp.prev=newNode;
        newNode.next=temp;
    }

    public void removeDataAtAnyPost(int pos){
        //? head positoin
        if(pos==0){
            head=head.next;
            head.prev.next=null;
            head.prev=null;
        }
        else{
            Node current = head;
            for(int i=1; i<=pos; i++){
                current = current.next;
            }
            current.prev.next=current.next;
            current.next.prev=current.prev;
            current.next=null;
        }
    }

}
