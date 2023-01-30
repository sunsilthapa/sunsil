package MergeSortCode;

import java.util.Arrays;

public class MergeSort {
    void merge(int A[], int start, int mid, int end){
        int leftLength= mid-start+1;
        int rightLength= end-mid;

        int l[] = new int[leftLength];
        int r[]= new int[rightLength];

        for (int i=0; i<leftLength; i++){
            l[i]=A[i+start];
        }

        for(int i=0; i<rightLength; i++){
            r[i]=A[mid+1+i];
        }

        int lp=0;
        int rp=0;
        int Ap=start;
        while (lp!=leftLength && rp!=rightLength){
            if(l[lp]<r[rp]){
                A[Ap]=l[lp];
                lp++; Ap++;
            }else{
                A[Ap]=r[rp];
                rp++; Ap++;
            }
        }

        while(rp==rightLength && lp!=leftLength){
            A[Ap]=l[lp];
            lp++; Ap++;
        }

        while (lp==leftLength && rp!=rightLength){
            A[Ap] = r[rp];
            rp++; Ap++;
        }

    }
    void mergeSort(int[] A, int start,  int end){
        if(start<end){
            int mid=(start+end)/2;

            mergeSort(A, start,  mid);
            mergeSort(A,  mid+1, end);
            merge(A, start, mid, end);
        }
    }

    static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] arr ={ 12,11,13,5,6,7};

        System.out.println("Given array: ");
        printArray(arr);

        MergeSort sort = new MergeSort();
        sort.mergeSort(arr, 0, arr.length-1);

        System.out.println("\n Sorted array");
        printArray(arr);
    }
}
