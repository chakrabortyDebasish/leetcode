import java.util.Scanner;

/**
 * P02 [520. Detect Capital]
 * 
 * We define the usage of capitals in a word to be right when one of the
 * following cases holds:
 * 
 * All letters in this word are capitals, like "USA".
 * All letters in this word are not capitals, like "leetcode".
 * Only the first letter in this word is capital, like "Google".
 * Given a string word, return true if the usage of capitals in it is right.
 * 
 * Input: word = "USA"
 * Output: true
 * 
 * Input: word = "FlaG"
 * Output: false
 */
public class P02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        System.out.println(detectCaptialUse(word));

        sc.close();
    }
    /*
     * private static boolean detectCaptialUse(String word) {
     * 
     * if (word.length() <= 1)
     * return true;
     * 
     * boolean allLower = false, mid = false, allUpper = false;
     * 
     * if (Character.isLowerCase(word.charAt(0))) {
     * // all should be lower-case
     * allLower = true;
     * } else if (Character.isUpperCase(word.charAt(0)) &&
     * Character.isLowerCase(word.charAt(word.length() - 1))) {
     * // all should be lower-case
     * mid = true;
     * } else {
     * // all should be upper-case
     * allUpper = true;
     * }
     * 
     * for (int i = 1; i < word.length(); i++) {
     * if (Character.isUpperCase(word.charAt(i)) && (mid || allLower))
     * return false;
     * if (Character.isLowerCase(word.charAt(i)) && allUpper)
     * return false;
     * }
     * 
     * return true;
     * }
     */

    private static boolean detectCaptialUse(String word) {

        Boolean response = Character.isUpperCase(word.charAt(0));

        Integer count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i)))
                count++;

        }

        if ((response && count == 1) || (count == 0) || (word.length() - count == 0))
            return true;

        return false;
    }
}