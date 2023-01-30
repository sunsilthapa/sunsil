package Graph;//* time complexity = O(n)

public class SinglyLInkedList {
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

    public  void addNodeLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;

        }
        else{
            // * using double pointer then (time complexity becomes constant)
            tail.next= newNode;
            tail= newNode;

            //* using while loop and single pointer head ( here time complexity is O(n). )
//                Node current= head;
//                while(current.next!=null){  //? while loop to reach in last desired node
//                    current= current.next;
//                }
//                current.next=newNode;
        }
        size++;

    }

    public  void printList(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data );
            current= current.next;
        }
    }

    public int getDataAtAnyPos(int pos){
        Node current = head;
        for(int i=2; i<=pos; i++){
            current= current.next;
        }
        return  current.data;
    }

    public void removeDataAtAnyPos(int pos){
        if(pos==1){
            Node temp= head;
            head= head.next;
            temp.next=null;
        }
        else {
            Node current= head;
            for(int i=2; i<pos; i++){
                current= current.next;
            }
            Node nextnode= current.next;
            current.next= nextnode.next;
            nextnode.next= null;
        }
        size--;
    }

    public void addHeadFirst(int data){
        Node newNode= new Node(data);

        if(head==null){
            head=newNode;
        }
        Node prevNode= head;  //
        head=newNode;
        newNode.next=prevNode;
    }

    public int detectCycle(){
        Node slow=null;
        Node fast= null;
        while(slow!=null && fast!=null){
            slow=slow.next;
            fast= fast.next.next;
            if(slow==fast){
                return 1;
            }
        }
        return 0;
    }

    public void insertAtAnyPost(int pos, int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }
        Node current = head;
        for(int i=0; i<(pos-1); i++){
            current=current.next;
        }
        Node temp=current;
        current.next=newNode;
        newNode.next=temp;

    }

    public static void main(String[] args) {
        SinglyLInkedList singlyLInkedList= new SinglyLInkedList();
        singlyLInkedList.addHeadFirst(5);
        singlyLInkedList.addHeadFirst(10);
        singlyLInkedList.addHeadFirst(7);
        singlyLInkedList.insertAtAnyPost(2, 50);
        singlyLInkedList.printList();
    }
}
