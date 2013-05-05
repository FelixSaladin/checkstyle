package biz.ezcom.checkstyle.whitespaces;

/**
 *
 */
public class EmptyForInitializerPad {
    /**
     * 
     */
    public EmptyForInitializerPad() {
    }
    /**
     * 
     */
    public final void p1() {
        int i = 1;
//        for ( ; i < 2; ++i) {
        for (; i < 2; ++i) {
            System.out.println();
        }
    }
}
