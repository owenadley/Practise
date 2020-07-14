import java.util.*;
public class ArrayPractise {
    
    public static int findDup(int[] arr) {

        HashSet<Integer> hs = new HashSet<Integer>();
        int dup = -1;

        for (int i=0; i<arr.length; i++) {
            if (hs.contains(arr[i])) {
                dup = arr[i];
            } else {
                hs.add(arr[i]);
            }
        }
        return dup;
    }

    public static int findMissing(int[] arr) {
        
        int missing = -1;
        Arrays.sort(arr);
    
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);

            if (arr[i] != arr[0]) {
                if (arr[i] != arr[i-1] + 1) {
                    missing = arr[i];
                } 
            } else {
                if (arr[i] != arr[i+1]-1) {
                    missing = arr[i];
                }
            }
        }

        return missing;

    }

    public static int contiguousSum(int[] arr) {

        int maxEnd = 0;
        int max = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++) {

            maxEnd = maxEnd + arr[i];
            if (max < maxEnd) {
                max = maxEnd;
            }
            if (maxEnd < 0) {
                maxEnd = 0;
            }


        }
        return max;

    }

    public static int[] shuffle(int[] arr) {
        
        Random rand = new Random();

        for (int i=0; i<arr.length; i++) {
            int randNum = i + rand.nextInt(arr.length - i);
            System.out.println(randNum);

            int temp = arr[randNum];
            arr[randNum] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    public static int twoSum(int[] arr) {

        int max1, max2;


        if (arr[0] > arr[1]) {
            max1 = arr[0];
            max2 = arr[1];
        } else {
            max1 = arr[1];
            max2 = arr[0];
        }

        for (int i=0; i<arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i]!=max1) {
                max2 = arr[i];
            }
        }

        return (max2 + max1);

    }

    public static void main (String[] args) {

        int[] numbers = {-2, -3, -4, -1, -2, -1, -5, -3};
        //int dup = contiguousSum(numbers);
        //System.out.println(dup);

        int a[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 
            9, 10, 11, 12, 13, 14, 15, 
            16, 17, 18, 19, 20, 21, 22, 
            23, 24, 25, 26, 27, 28, 29, 
            30, 31, 32, 33, 34, 35, 36, 
            37, 38, 39, 40, 41, 42, 43, 
            44, 45, 46, 47, 48, 49, 50,  
            51};
 
        //int[] sorted = shuffle(a);
        //for (int i=0; i<sorted.length; i++) {
            //System.out.println(sorted[i]);
        //}

        int maxSum = twoSum(numbers);
        System.out.println(maxSum);

    }

}