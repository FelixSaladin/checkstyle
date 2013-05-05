package biz.ezcom.checkstyle.coding_problems;

/**
 * 
 */
public class MissingSwitchDefault {
    /**
     * 
     */
    public MissingSwitchDefault() {
        final int i = 1;
        switch (i) {
            case 1 :
                break;
            // default:
            // break;
        }
    }
}
