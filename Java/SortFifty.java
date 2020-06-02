public class SortFifty {
    public static void main(String[] args) {
        int[] unsortedArr = new int[] {60, 70, 80, 90, 30, 100};
        int[] sortedArr = sortArray(unsortedArr);
        for (int i=0; i<=sortedArr.length-1; i++) {
            System.out.println(sortedArr[i]);
        }
    }
    public static int[] sortArray(int[] arr) {
        int j = 0, temp;    //O(1)
        for (int i=0; i<arr.length; i++) {  //O(n) , linear time
            if (arr[i] > 50) {  //O(1)
                if(i != j) {    //O(1)
                    temp = arr[i];  //O(1)
                    arr[i] = arr[j];    //O(1)
                    arr[j] = temp;  //O(1)
                }
                j++;    //O(1)
            }
        }
        
        return arr;
    }
}