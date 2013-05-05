package biz.ezcom.checkstyle.blocks;

/**
 * 
 */
public class AvoidNestedBlocks {
    /**
     * 
     */
    public AvoidNestedBlocks() {
        final boolean b = true;
        if (b) {
            {
                System.out.println();
            }
        }
    }
}
