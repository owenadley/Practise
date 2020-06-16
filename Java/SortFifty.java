public class SortFifty {
    public static void main(String[] args) {
        int[] unsortedArr = new int[] {60, 70, 80, 90, 30, 100};
        int[] sortedArr = sortArray(unsortedArr);
        for (int i=0; i<=sortedArr.length-1; i++) {
            System.out.println(sortedArr[i]);
        }
        
    }
    public static int[] sortArray(int[] arr) {
     int j=0, temp;

       for (int i=0; i<arr.length; i++) {
           if (arr[i] > 50) {
                if (i!=j) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
                j++;
            }  
        }
        return arr;
    }
}