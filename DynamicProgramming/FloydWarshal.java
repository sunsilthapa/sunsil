package DynamicProgramming;

public class FloydWarshal {

    public  void floydWarshal(int d[][], int v){
        // k is via vertex
        for(int k=0; k<v; k++){
            // loop through row
            for(int i=0; i<v; i++){
                // loop though column
                for(int j=0; j<v; j++){
                    d[i][j] = Math.min(d[i][j], d[i][k]+d[k][j]); //or  if(d[i
                }
            }

        }
    }

}
