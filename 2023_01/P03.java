import java.util.Scanner;

/**
 * P03 [944. Deleted Colums to make sorted]
 * 
 * You are given an array of n strings strs, all of the same length.
 * 
 * The strings can be arranged such that there is one on each line, making a
 * grid. For example, strs = ["abc", "bce", "cae"] can be arranged as:
 * 
 * abc
 * bce
 * cae
 * You want to delete the columns that are not sorted lexicographically. In the
 * above example (0-indexed), columns 0 ('a', 'b', 'c') and 2 ('c', 'e', 'e')
 * are sorted while column 1 ('b', 'c', 'a') is not, so you would delete column
 * 1.
 * 
 * Return the number of columns that you will delete.
 */
public class P03 {

    public static void main(String[] args) {
        String[] strs = new String[] { "abc", "bce", "cae" };
        System.out.println(minDeletionSize(strs));
    }

    private static int minDeletionSize(String[] strs) {

        int deleteCount = 0;

        for (int gridRow = 0; gridRow < strs[0].length(); gridRow++) {
            for (int gridColumn = 0; gridColumn < strs.length - 1; gridColumn++) {
                if (strs[gridColumn].charAt(gridRow) > strs[gridColumn + 1].charAt(gridRow)) {
                    deleteCount++;
                    break;
                }
            }
        }

        return deleteCount;
    }
}