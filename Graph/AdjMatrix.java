package Graph;

import java.util.*;

public class AdjMatrix {
    int vertices;
    int matrix[][];
    AdjMatrix(int vertices){
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }

    public void addEdge(int source , int destination){  //if weight of weighted graph is give then matrix[source][des]=w
        matrix[source][destination]=1;
        matrix[destination][source]=1;
    }

    public void printGraph(){
        // move thorough row
        for(int i=0; i<vertices; i++){
            System.out.print(i + "is connected to ");
            //mofe throught col
            for(int j=0; j<vertices; j++){
                if(matrix[i][j]!=0){
                    System.out.print(j+ " , ");
                }
            }
        }
        System.out.println();

    }

    List<Integer> getAdjNode(int vertex){
        ArrayList<Integer> list= new ArrayList<>();
        for(int j=0; j<vertices; j++){
            if(matrix[vertex][j]!=0){
                list.add(j);
            }
        }
        return list;
    }

    // BFS implementation

    public  void BFS(int source){
        boolean visited[] = new boolean[vertices];
        LinearQueue queue = new LinearQueue(vertices);
        queue.enqueOperation(source);
        visited[source]=true;
        while(!queue.isEmpty()){
            int val = queue.dequeOperation();
            System.out.println(val);
            Iterator<Integer> iterator = getAdjNode(val).iterator();
//           or you can use forloop
//            List<Integer> list = getAdjNode(val);
//            for(int i=0; i< list.size(); i++){}
            while (iterator.hasNext()){
                int adjval = iterator.next();
                if(!visited[adjval]){
                    queue.enqueOperation(adjval);
                    visited[adjval] = true;
                }
            }
        }
    }

    // DFS using recurssion
    public  void DFS(int source){
        boolean visited[] = new boolean[vertices];
        dfs(source, visited);
    }

    public void dfs(int source, boolean[] visited){
        visited[source]=true;     // first element should be already visited
        System.out.println(source);
        Iterator<Integer> iterator = getAdjNode(source).iterator(); // to get adjacent nodes
        while (iterator.hasNext()){
            int adjval = iterator.next();
            if(!visited[adjval]){
                dfs(adjval, visited);
            }
        }
    }

    // DFS using linear approach

    ///Dijkastra algorithm
    public void dijakstra(int source){
        int distance[]=new int[vertices];
        int prevpath[]=new int[vertices];
        boolean visited[]=new boolean[vertices];

        for (int i=0; i<vertices; i++){
            distance[i]=Integer.MAX_VALUE;
            prevpath[i]=-1;
        }
        distance[source]=0;
        for (int i=0; i<vertices; i++){
            int minvertex=findminVertex(distance, visited);
            visited[minvertex]=true;
            for (int j=0; j<vertices; j++){
                if(matrix[minvertex][j]!=0 && !visited[j]){
                    //relaxtation step
                    if(distance[minvertex]+matrix[minvertex][j]<distance[j]){
                        distance[j]=distance[minvertex]+matrix[minvertex][j];
                        prevpath[j]=minvertex;
                    }
                }
            }
        }
    }

    public int findminVertex(int [] distance, boolean[] visited){
        int minvertex=-1;
        for (int i=0; i<distance.length; i++){
            if(!visited[i] && (minvertex==-1 || distance[minvertex]>distance[i])){
                minvertex=i;
            }
        }
        return minvertex;
    }




    public static void main(String[] args) {
        AdjMatrix adjMatrix = new AdjMatrix(4);
        adjMatrix.addEdge(0,1);
        adjMatrix.addEdge(0,2);
        adjMatrix.addEdge(0,3);
        adjMatrix.addEdge(1,2);
        adjMatrix.addEdge(2,3);

        adjMatrix.printGraph();
    }
}
