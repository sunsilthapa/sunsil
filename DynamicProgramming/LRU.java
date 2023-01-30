package DynamicProgramming;

import java.util.HashMap;


public class LRU {
    public static class Node{
        int key;
        int value;
        Node prev;
        Node next;
        Node(int key, int value){
            this.key = key;
            this.value= value;
            this.next=this.prev=null;
        }
    }

    int capacity;
    HashMap<Integer, Node> map;
    LRU(int capacity){
        this.capacity= capacity;
        map=new HashMap<>();
    }

    void put(int key, int value){
        if(map.containsKey(key)){
            //? remove node: for updating
            remove(map.get(key));
        }else if(map.size()==capacity){ //* full condition
            //? remove tial
            remove(tail);
        }
        Node newnode= new Node(key, value);
        insert(newnode);
    }

    Node head =null;
    Node tail = null;
    void insert(Node newnode){
        map.put(newnode.key, newnode);
        if(head==null){
            head= tail= newnode;
        }else{
            head.prev=newnode;
            newnode.next=head;
            head=newnode;
        }
    }

    public int get(int key){
        Node node= map.get(key);
        if(node==null){
            return -1;
        }
        remove(node);
        insert(node);
        return  node.value;
    }

    public void remove(Node node){
        map.remove(node.key);
        if(node==head && head==tail){
            head=tail=null;
        }
        else if(node==head){
            head=head.next;
            head.prev.next=null;
            head.prev=null;
        }
        else if(node==tail){
            tail=tail.prev;
            tail.next.prev=null;
            tail.next=null;
        }
        else{
            node.prev.next=node.next;
            node.next.prev=node.prev;
            node.next=node.prev=null;
        }
    }
}
