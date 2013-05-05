package biz.ezcom.checkstyle.coding_problems;

/**
 * 
 */
public class IllegalToken {
    /**
     * 
     */
    public IllegalToken() {
        int i = 1;
        i++;
        ++i;
        i--;
        --i;
        switch (i) {
            default :
                break;
        }
    }
}
