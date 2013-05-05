package biz.ezcom.checkstyle.coding_problems;

/**
 * 
 */
public class FallThrough {
    /**
     * 
     */
    public FallThrough() {
        final int i = 1;
        switch (i) {
            case 1 :
                System.out.println();
                // 无break,return时，必需有 FALL through(把FALL改小写就没有警告了)
            default :
                System.out.println();
        }
    }
}
