package biz.ezcom.checkstyle.coding_problems;

/**
 * 
 */
public class ReturnCount {
    /**
     * 
     */
    public ReturnCount() {
    }

    /**
     * 
     */
    public final void process() {
        boolean b = true;
        b = false;
        if (b) {
            return;
        }
        if (b) {
            return;
        }
        if (b) {
            return;
        }
    }
}
