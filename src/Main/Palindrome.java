package Main;

public class Palindrome {
    static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return false;

    }
    public static void main( String[] args){
        System.out.println(isPalindrome("şemsipaşapasajı"));
    }
}
