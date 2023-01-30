package Arrayy;

public class  MissingMinimunEle {
    // TODO: find the missing minimum no from the array
    // ? input: int a[]={0,1,5,7,3,200,2,100000}; all positive no only
    //? output: 4;
   /* int missingValue(int a[]){
        for(int i=0; i<Integer.MAX_VALUE; i++){
            boolean status=false;
            for(int j=0; j<a.length; j++){
                if(i==a[j]){
                    status=true;
                }
            }
            if(!status){
                return i;
            }
        }
      return  0;
    }

    public static void main(String[] args) {
        ArrayQuestion2 arrayQuestion2= new ArrayQuestion2();
        System.out.println(arrayQuestion2.missingValue(new int[]{1,5,6,3,2,0,500,10000}));
    }*/
    //? time complexity=O(n2)

    // ? another method
    int findMissing(int a[]){
        boolean b[]= new boolean[Integer.MAX_VALUE];
        for(int i=0; i<=a.length; i++){
            int indexPos=a[i];
            b[indexPos]=true;
        }

        for(int i=0; i<b.length;i++){
            if(!b[i]){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        MissingMinimunEle arrayQuestion2= new MissingMinimunEle();
        System.out.println(arrayQuestion2.findMissing(new int[]{1,8,4,5,7,34,0,9}));
    }
}
