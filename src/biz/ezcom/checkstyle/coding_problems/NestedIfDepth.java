package biz.ezcom.checkstyle.coding_problems;

/**
 * 
 */
public class NestedIfDepth {
    /**
     *
     */
    public NestedIfDepth() {
        boolean b = true;
        b = false;
        if (b) {
            if (b) {
                if (b) {
                    System.out.println();
                }
            }
        }
    }
}
