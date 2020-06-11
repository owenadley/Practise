import java.util.*;

public class Test {

    public static void main(String[] args) {
        //arrays();
        //hashtables(5);

        int[] arr = {2, 4, 1};
        int[] sortedArr = insertionSort(arr);

        for (int k=0; k<sortedArr.length; k++) {
            System.out.println(sortedArr[k]);
        }
    }

    public static void hashtables(int size) {
        // very fast insertion and searching
        // limited in size because they are based on array
        String[] theArr = new String[size];
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>(3);

        //int key = value.hashCode()%3;

        Integer test = 40;
        System.out.println((test.hashCode())%3);


        ht.put(2, "Slurp");
        ht.put(4, "Sprung");
        ht.put(6, "Adley");
        ht.put(12, "Derp");
        ht.put(3, "Merp");

        System.out.println(ht);

    }
    public void arrays() {
        //array
        String[] myarray = {"hello", "world"};
        System.out.println(myarray[0]);

        int[] nums = {20, 303};
        //System.out.println(nums[1]);

        for (int i=0; i<nums.length; i++) {
            System.out.println(nums[i]);
        }

        //arraylist
         ArrayList<String> arrlist = new ArrayList<String>();
         arrlist.add("Hello");
         arrlist.add("World");
         String resr = arrlist.get(0);
        // System.out.println(resr);
        //System.out.println(arrlist);

         ArrayList<Integer> rl = new ArrayList<Integer>();
         rl.add(3);
         rl.add(5);

         //System.out.println(rl);

         for (int i=0; i<rl.size(); i++) {
             //System.out.println(rl.get(i));
         }
         for (int i : rl) {
             //System.out.println(i);
         }
    }

    // worst O(n^2)
    public static int[] bubbleSort(int[] arr) {

        // compare side by side numbers and swap so smaller number is on the left
        // O(n^2)
        int n = arr.length; 
        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr) {

        // iterate through and find the smallest number. Take this number and move it to the left
        // SELECT the smallest number and put it in place
        // O(n^2)
        int n = arr.length;
        int min, j;

        for (int i=0; i<n-1; i++) {
            min = i;

            for (j=i+1; j<n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }   

    public static int[] insertionSort(int[] arr) {

        // iterate through and for each element move it to its correct location on the left (sorted) side.
        // move the elements that are on the left to the right if they are larger than the current number
        // INSERT the next number in its proper location in the sorted array to the left
        // O(n^2)

        int n = arr.length;
        
         for (int i=1; i<n; i++) {  //O(n)
            int temp = arr[i];
            int j = i-1;

            while (j >= 0 && arr[j] > temp) {   //O(n)
                arr[j + 1] = arr[ j ];
                j = j - 1;
            }
            arr[j + 1] = temp;
        } 


        return arr;

    }

 
}

