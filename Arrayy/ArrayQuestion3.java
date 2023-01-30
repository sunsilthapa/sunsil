package Arrayy;// ? how

import java.util.Arrays;

public class ArrayQuestion3 {
    static int trapWater( int h[]){
        int leftMax[] = new int[h.length];
        int rightMax[] = new int[h.length];
        leftMax[0]=h[0];
//        for (int i=1; i<h.length; i++){
//            if(leftMax[i-1]>h[i]){
//                leftMax[i]=leftMax[i-1];
//            }else{
//                leftMax[i]=h[i];
//            }
//        }
        for(int i=0; i<h.length; i++){
            if(h[i]>leftMax[i]){

            }
        }
        System.out.println(Arrays.toString(leftMax));

        rightMax[h.length-1]=h[h.length-1];
        for(int i=h.length-2; i>=0; i--){
            if(rightMax[i+1]>h[i]){
                rightMax[i]=rightMax[i+1];
            }else{
                rightMax[i]=h[i];
            }
        }
        System.out.println(Arrays.toString(rightMax));

        int sum=0;
        for(int i=0; i< h.length; i++){
            sum=sum+Math.min(leftMax[i], rightMax[i])-h[i];
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(ArrayQuestion3.trapWater(new int[]{3, 2, 0, 2, 4}));
    }
}
