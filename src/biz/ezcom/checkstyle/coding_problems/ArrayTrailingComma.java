package biz.ezcom.checkstyle.coding_problems;

/**
 * 
 */
public class ArrayTrailingComma {
    /**
     */
    public ArrayTrailingComma() {
        final int[] a = {1, 2};
        final int[] b = new int[]{
            1,
            2
        };
        
        System.out.println(a);
        System.out.println(b);
    }
}
