package biz.ezcom.checkstyle.coding_problems;
/**
 * 
 */
public class FinalLocalVariable {
    /**
     * 
     */
    public FinalLocalVariable() {
        int a = 1;
        System.out.println(a);
        int b = 1;
        b = 2;
        System.out.println(b);
        final int c = 1;
        System.out.println(c);
    }
    
}
