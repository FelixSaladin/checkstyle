package biz.ezcom.checkstyle.coding_problems;

/**
 *
 */
public class NestedForDepth {
    /**
     * 
     */
    public NestedForDepth() {
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 2; ++j) {
                for (int k = 0; k < 2; ++k) {
                    System.out.println();
                }
            }
        }
    }
}
