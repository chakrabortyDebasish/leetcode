import java.util.HashMap;
import java.util.Scanner;

/**
 P01    [290. Word Pattern]

 Given a pattern and a string s, find if s follows the same pattern. Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

 Input: pattern = "abba", s = "dog cat cat dog"
Output: true

 Input: pattern = "abba", s = "dog cat cat fish"
Output: false

 Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false
 */
public class P01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // abba
        String pattern = sc.next(); 

        // dog cat cat dog
        String str = sc.nextLine();

        System.out.println(wordPattern(pattern, str));

        sc.close();
    }

                                        // "abba",    "dog cat cat dog"
    private static boolean wordPattern(String pattern, String str) {

        // [dog,cat,cat,dog]
        String[] wordArr = str.split(" ");

        // if length not equal of array and pattern its already different
        if(wordArr.length != pattern.length()) return false;

        // else part
        HashMap<Object, Integer> hMap = new HashMap<>();

        for (int i = 0; i < wordArr.length; i++) {
            if (hMap.put(pattern.charAt(i), i) != hMap.put(wordArr[i], i)) {
                return false;
            }    
        }

        return true;
    }
}