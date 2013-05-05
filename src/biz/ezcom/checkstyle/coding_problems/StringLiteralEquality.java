package biz.ezcom.checkstyle.coding_problems;

/**
 * 
 */
public class StringLiteralEquality {
    /**
     * 
     */
    public StringLiteralEquality() {
        final String a = "a";
        final String b = "b";
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a == "c");
        System.out.println(a != "d");
    }
}
