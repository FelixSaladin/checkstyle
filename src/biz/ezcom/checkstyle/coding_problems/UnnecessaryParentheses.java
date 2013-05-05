package biz.ezcom.checkstyle.coding_problems;

/**
 * 
 */
public class UnnecessaryParentheses {
    /**
     * 
     */
    public UnnecessaryParentheses() {
        final String a = ("a");
        final boolean b = (true && false);
        System.out.println(a + b);
    }
}
