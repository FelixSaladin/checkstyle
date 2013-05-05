package biz.ezcom.checkstyle.coding_problems;

/**
 * 
 */
public class DefaultComesLast {
    /**
     * 
     */
    public DefaultComesLast() {
        final int i = 1;
        switch (i) {
            default :
                break;
            case 1 :
                break;
        }
    }
}
