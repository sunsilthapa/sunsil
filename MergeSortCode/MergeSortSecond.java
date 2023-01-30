package MergeSortCode;//package MergeSortCode;
//
//public class MergeSortSecondAttempt {
//    void merge(int []arr, int start, int mid, int end){
//        // find sizes of two subarrays to be merged
//        int p1= mid-start+1;
//        int p2= end-mid;
//
//        //? create temp arrays
//        int[] a = new int[p1];
//        int[] b = new int[p1];
//
//        // copy data to temp arrays
//        for(int i=0; i<p1; i++){
//            a[i]=arr[i+start];
//        }
//        for(int j=0; j<p2; j++){
//            b[j]=arr[mid+1+j];
//        }
//
//        /* Merge the temp arrays */
//
//        //initial indeses of first and second sub array
//        int j=0;     int k=0;
//        // initial index of merged subarray array
//        int l=j;
//        while(j!=p1 && k!=p2){
//            if(a[j]<b[k]){
//                arr[l]=a[j];
//                j++;
//            }else{
//                arr[l]=b[k];
//            }
//            l++;
//        }
//
//        // copy remaining elements of left array if any
//        while(j!=p1){
//            arr[l]=a[j];
//            j++;
//            l++;
//        }
//
//        // copy remaining element of right array
//        while(k!=p2){
//            arr[l]=b[k];
//            k++;
//            l++;
//
//        }
//    }
//    void mergeSort(int [] arr, int start, int end){
//        if(start<end){
//            int mid=(start+end)/2;
//
//            //sort right and left halves
//            mergeSort(arr, start, mid);
//            mergeSort(arr, mid+1, end);
//
//            // merge the sorted halves
//            merge(arr, start, mid, end);
//        }
//    }
//    static void printArray(int[] arr){
//        for (int j : arr) {
//            System.out.print(j + " ");
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr ={ 12,11,13,5,6,7};
//        System.out.println("Given array: ");
//        printArray(arr);
//
//        MergeSort sort = new MergeSort();
//        sort.mergeSort(arr, 0, arr.length-1);
//
//        System.out.println("\n Sorted array");
//        printArray(arr);
//    }
//}

/* Java program for Merge Sort */
class MergeSortSecond {
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given Array");
        printArray(arr);

        MergeSortSecond ob = new MergeSortSecond();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr);
    }
}