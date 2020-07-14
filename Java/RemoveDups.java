import java.util.HashSet;

public class RemoveDups {
    

    public static String removeDups(String str) {

        char[] arr = str.toCharArray();
        int curr = 0;
        String noDups = "";
        HashSet<Character> hs = new HashSet<Character>();

        while(curr != arr.length) {
           hs.add(arr[curr]);
           curr++;
        }
        for (Character ch : hs) {
            noDups = noDups + ch;
        }
        return noDups;
    }

    public static void main (String[] args) {
        String str = removeDups("Hello World");
        System.out.println(str);
    }

    


}