
class  ApnaCollegeList{
    Node head=null;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next= null;
        }
    }

    public void addFirst(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
    }

    //? print link list
    public void printList(){
        if(head==null){
            System.out.println("Empty list.");
            return;
        }
        Node currentNode = head;
        while (currentNode!=null){
            System.out.println(currentNode.data + " => ");
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ApnaCollegeList linkedList= new ApnaCollegeList();

        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.printList();
    }
}