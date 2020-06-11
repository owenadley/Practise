import java.util.*;

class Reversal {
    public static void main (String[] args) {

        System.out.println(2 & 3);
        System.out.println(2 | 3);

        int[] arr = {2, 3, 5, 2, 7, 3, 8, 2};
        int[] sortedArr = reverse(arr);

        for (int i=0; i<sortedArr.length; i++) {
            System.out.println(sortedArr[i]);
        }
    }


    public static int[] reverse(int[] arr) {
        
        Stack<Integer> stack = new Stack<Integer>();
        int[] sortedArr = new int[arr.length];

        for (int i=0; i<arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int j=0; j<arr.length; j++) {
            sortedArr[j] = stack.pop();
        }
        return sortedArr;
    }
}