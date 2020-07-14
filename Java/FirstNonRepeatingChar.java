import java.util.*;
public class FirstNonRepeatingChar {
    
    public static void findFirstNR(String str) {

        Hashtable<Character, Integer> ht = new Hashtable<Character, Integer>();

        for (int i=0; i<str.length(); i++) {

            char key = str.charAt(i);

            if (ht.get(key) == null) {
                ht.put(key, 1);
            } else {
                ht.put(key, ht.get(key) + 1);
            }
        }

        for (int j=0; j<str.length(); j++) {
            if (ht.get(str.charAt(j)) == 1) {
                System.out.println(str.charAt(j));
                break;
            }
        }
        

    }



    public static void main (String[] args) {

        findFirstNR("TESTY");

    }

}