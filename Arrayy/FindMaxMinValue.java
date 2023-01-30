package Arrayy;

import java.util.Arrays;
// todo: find the min and max value using array
public class FindMaxMinValue {
    int [] findMinMax(int arry[]){
        int maxVal=arry[0];
        int minVal=arry[0];
        for(int i=1; i<arry.length; i++){
            if(arry[i]>maxVal){
                maxVal=arry[i];
            }
        }
        for(int i=1; i<arry.length; i++){
            if(arry[i]<minVal){
                minVal=arry[i];
            }
        }
        int b[] = new int[2];
        b[0]=maxVal;
        b[1]=minVal;
        return b;
    }
    public static void main(String[] args) {
        FindMaxMinValue a= new FindMaxMinValue();
        int []arry={1,4,53,6,3,8,44};
        System.out.println(Arrays.toString(a.findMinMax(arry)));;
    }
}
