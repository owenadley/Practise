public class Palindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindromeByString(212353212));
    }

    public static boolean checkPalindromeByString(int n) {
        String nLen = "" + n;

        for (int i=1; i<=nLen.length(); i++) {
            if (nLen.charAt(i-1) != nLen.charAt(nLen.length()-i)) {
                return false;
            }
        }
        return true;
    } 

}