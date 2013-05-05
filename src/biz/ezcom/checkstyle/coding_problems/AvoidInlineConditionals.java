package biz.ezcom.checkstyle.coding_problems;

/**
 * 
 */
public class AvoidInlineConditionals {
    /**
     * 
     */
    public AvoidInlineConditionals() {
        final boolean b = true;
        final int i = b ? 1 : 2;
        System.out.println(i);
    }
}
