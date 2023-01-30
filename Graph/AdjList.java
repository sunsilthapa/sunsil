package Graph;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;

public class AdjList {
    int vertices;
    SinglyLInkedList[] list;


    AdjList(int vertices){
        this.vertices = vertices;
        list = new SinglyLInkedList[vertices];  // initialize list(linklist) size of no of vertices
        for(int i =0; i<vertices; i++){      // store all address of linklist in array of lsit[]
             list[i]=new SinglyLInkedList();
        }
    }

    public  void addEdge(int source, int destination){
        list[source].addNodeLast(destination);
        list[destination].addNodeLast(source);
    }

    public  void printGraph(){
        for (int i=0; i<vertices; i++){
            System.out.print(i+ " is connected to ");
            SinglyLInkedList.Node current = list[i].head;  // store
            while (current!=null){
                System.out.print(current.data + ", ");
                current= current.next;
            }
            System.out.println();
        }
    }

    List<Integer> getAdjNode(int v){
        ArrayList<Integer> adjlist = new ArrayList<Integer>();
        SinglyLInkedList.Node current = list[v].head;
        while (current!=null){
            adjlist.add(current.data);
            current= current.next;
        }
        return adjlist;
    }


    public static void main(String[] args) {
        AdjList adjList = new AdjList(6);
        adjList.addEdge(0,1);
        adjList.addEdge(0,2);
        adjList.addEdge(0,3);
        adjList.addEdge(0,4);
        adjList.addEdge(0,5);
        adjList.addEdge(1,3);
        adjList.addEdge(2,4);
        adjList.printGraph();
    }


}
