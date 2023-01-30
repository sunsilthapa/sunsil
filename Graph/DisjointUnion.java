package Graph;

//cycle detection in undirected graph by disjointunion algorithm
public class DisjointUnion {
    int parent[];
    int size[];
    int vertices;

    DisjointUnion(int vertices){
        this.vertices= vertices;
        this.parent=new int[vertices];
        this.size = new int[vertices];

        for (int i=0; i<vertices; i++){
            parent[i]=-1;
        }
    }

    public int isCycleDetected(int u, int v){

        int uabsroot = find(u);
        int vabsroot = find(v);

        // if cycle detected
        if(vabsroot==uabsroot){
            System.out.println("Cycle detected.");
            return 1;
        }
        //else union
        union(uabsroot, vabsroot);


        return  0;
    }

    // find by path compression
    int find(int vertex){
        if(parent[vertex]==-1){
            return  vertex;
        }
        return parent[vertex]=find(parent[vertex]); // path compression
    }

    //union by rank
    public void union(int uabsroot, int vabsroot ){
        if(size[uabsroot]==size[vabsroot]){
            parent[uabsroot]=vabsroot;
            size[vabsroot]++;  //increasee rank
        }
        else if( size[uabsroot]>size[vabsroot]){
            parent[vabsroot]=uabsroot;
        }
        else {
            parent[uabsroot]=vabsroot;
        }

    }

    public static void main(String[] args) {
        DisjointUnion disjointUnion = new DisjointUnion(4);
        System.out.println(disjointUnion.isCycleDetected(0,1));
        System.out.println(disjointUnion.isCycleDetected(1,2));
        System.out.println(disjointUnion.isCycleDetected(0,2));
    }






}
