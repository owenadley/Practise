import java.nio.channels.SelectionKey;

public class Arrays {
    
    // array list 
    // ArrayList<Integer> arrList = new ArrayList<Integer>();
    // - part of Java collections, comes with built in functions get(index), add(value), set(index, value), remove(index)
    // 
    // array
    // int[] numbers = {1, 2, 3, 4, 5, 6, 7}
    // access values by using the index: int[2] // 3



    public static int[] bubbleSort(int[] arr) {
        // two loops
        // each pass will put the largest number to its correct position at the end of the array
        for (int i=0; i<arr.length; i++) {
            for (int j=1; j<arr.length-i; j++) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        // two loops, get the next value and insert it into its proper location on the left (sorted side)
        for (int i=1; i<arr.length; i++) {
            int temp = arr[i];
            int j = i-1;

            while (j >= 0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr; 
    }

    public static int[] selectionSort(int[] arr) {
        // two loops, go through the array and find the next smallest number. insert this into the next spot
        for (int i=0; i<arr.length; i++) {
            int temp = arr[i];
            int min = i;
            for (int j=i; j<arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    public static int[] quickSort(int[] arr, int low, int high) {

        if (low < high) {
            int pi = quickSortPartition(arr, low, high);

            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
        return arr;
    }

    public static int quickSortPartition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j=low; j<high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static int[] mergeSort(int arr[], int l, int r) {

        if (l < r) {
            int m = (l + r) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);

            arr = merge(arr, l, m, r);
        }

        return arr;
    }

    public static int[] merge(int[] arr, int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i=0; i<n1; i++) {
            L[i] = arr[l + i];
        }
        for (int i=0; i<n2; i++) {
            R[i] = arr[m + 1 + i];
        }

        int i=0, j=0;
        int k=l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

        return arr;
    }


    public static int binarySearch(int[] arr, int l, int r, int val) {
        
        if (l > r) {
            return -1;
        }

        int mid = (r + l) / 2;

        if (val == arr[mid]) {
            return mid;
        } else if (val > arr[mid]) {
            return binarySearch(arr, mid+1, r, val);
        } else if (val < arr[mid]) {
            return binarySearch(arr, l, mid-1, val);
        }

        return -1;

    }

    public static void main(String[] args) {

/*         int[] arr = {7, 2, 9, 20, 7, 43, 22, 8};
        arr = mergeSort(arr, 0, arr.length-1);

        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);

        } */

        int[] arr2 = {2, 4, 6, 7, 9, 12, 15, 27, 48};
        int bs = binarySearch(arr2, 0, arr2.length-1, 2);
        System.out.println(bs);

    }

}