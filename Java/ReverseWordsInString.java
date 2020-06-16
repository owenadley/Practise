public class ReverseWordsInString {
    

    public static String reverseWords(String str) {


        String allWords = "";
        String[] words = str.split(" ");

        for (int i=0; i<words.length; i++) {

            String word = "";
            for (int j=words[i].length()-1; j>=0; j--) {
                word = word + words[i].charAt(j);
            }

            allWords = allWords + word + " ";
        }
        return allWords;
    }

    public static String reverseStr(String str) {
        String rev = "";
        for (int i=str.length()-1; i>=0; i--) {
            rev = rev + str.charAt(i);
        }
        return rev;
    }

    public static String removeWhiteSpace(String str) {
        str = str.replaceAll("\\s", "");
        return str;
    }




    public static void main(String[] args) {
        String rev = reverseWords("Hello World My Name Is Owen");
        System.out.println(rev);

        String rev2 = reverseStr("Hello World My Name Is Owen");
        System.out.println(rev2);

        String noWhite = removeWhiteSpace("Hello World My Name Is Owen");
        System.out.println(noWhite);

    }
}