package QuickSort;

import java.util.Arrays;

public class QuickSort {
    public static int partition(int[] arr, int low , int high){
        int pivot= arr[high];
        int i=low-1;
        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        //swap
        int temp = arr[i];
        arr[i]=pivot; // arr[i] = arr[high]
        arr[high]=temp;

        return i; //pivot index
    }

    public static void quickSort(int[] arr, int low, int high) {
        if(low<high){
            int pivotIndex= partition(arr, low , high);

            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);
        }
    }

    public static void main(String[] args) {
        int arr[]= {3,5,2,9,4,10};
        int n= arr.length;

        System.out.println("Before : "+ Arrays.toString(arr));

        QuickSort.quickSort(arr, 0 ,n-1);

        System.out.print("After : ");

        for(int  i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();


    }


}
