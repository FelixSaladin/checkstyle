package biz.ezcom.checkstyle.coding_problems;

/**
 * 
 */
public class NestedTryDepth {
    /**
     * 
     */
    public NestedTryDepth() {
        try {
            try {
                try {
                    System.out.println();
                } catch (Exception e) {
                    System.out.println();
                }
            } catch (Exception e) {
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println();
        }
    }
}
